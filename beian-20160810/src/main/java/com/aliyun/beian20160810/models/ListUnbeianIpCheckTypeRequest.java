// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ListUnbeianIpCheckTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    @NameInMap("CheckType")
    public Integer checkType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Remark")
    public String remark;

    public static ListUnbeianIpCheckTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnbeianIpCheckTypeRequest self = new ListUnbeianIpCheckTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListUnbeianIpCheckTypeRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListUnbeianIpCheckTypeRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public ListUnbeianIpCheckTypeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListUnbeianIpCheckTypeRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListUnbeianIpCheckTypeRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListUnbeianIpCheckTypeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
