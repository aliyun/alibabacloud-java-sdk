// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("FaultAddrPool")
    public String faultAddrPool;

    public static UpdateGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmRecoveryPlanRequest self = new UpdateGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmRecoveryPlanRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public UpdateGtmRecoveryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGtmRecoveryPlanRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateGtmRecoveryPlanRequest setFaultAddrPool(String faultAddrPool) {
        this.faultAddrPool = faultAddrPool;
        return this;
    }
    public String getFaultAddrPool() {
        return this.faultAddrPool;
    }

}
