// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ExecuteGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the disaster recovery plan that you want to executed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    public static ExecuteGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteGtmRecoveryPlanRequest self = new ExecuteGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
