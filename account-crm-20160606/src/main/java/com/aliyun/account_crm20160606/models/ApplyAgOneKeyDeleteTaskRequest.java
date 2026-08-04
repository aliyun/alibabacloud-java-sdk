// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyAgOneKeyDeleteTaskRequest extends TeaModel {
    @NameInMap("AbandonedDependency")
    public String abandonedDependency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgAccountType")
    public String agAccountType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    public static ApplyAgOneKeyDeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAgOneKeyDeleteTaskRequest self = new ApplyAgOneKeyDeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAgOneKeyDeleteTaskRequest setAbandonedDependency(String abandonedDependency) {
        this.abandonedDependency = abandonedDependency;
        return this;
    }
    public String getAbandonedDependency() {
        return this.abandonedDependency;
    }

    public ApplyAgOneKeyDeleteTaskRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public ApplyAgOneKeyDeleteTaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApplyAgOneKeyDeleteTaskRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ApplyAgOneKeyDeleteTaskRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
