// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RollbackGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the disaster recovery plan that you want to roll back.</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    public static RollbackGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackGtmRecoveryPlanRequest self = new RollbackGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public RollbackGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RollbackGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
