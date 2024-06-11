// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorDomainWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operation")
    public String operation;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("StartTime")
    public String startTime;

    public static ManageAccessorDomainWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorDomainWhiteListRequest self = new ManageAccessorDomainWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ManageAccessorDomainWhiteListRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ManageAccessorDomainWhiteListRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public ManageAccessorDomainWhiteListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ManageAccessorDomainWhiteListRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ManageAccessorDomainWhiteListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ManageAccessorDomainWhiteListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
