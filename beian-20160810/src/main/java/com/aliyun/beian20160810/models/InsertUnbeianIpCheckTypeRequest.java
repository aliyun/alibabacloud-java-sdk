// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class InsertUnbeianIpCheckTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Remark")
    public String remark;

    public static InsertUnbeianIpCheckTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertUnbeianIpCheckTypeRequest self = new InsertUnbeianIpCheckTypeRequest();
        return TeaModel.build(map, self);
    }

    public InsertUnbeianIpCheckTypeRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public InsertUnbeianIpCheckTypeRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public InsertUnbeianIpCheckTypeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public InsertUnbeianIpCheckTypeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
