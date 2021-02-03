// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public Long recoveryPlanId;

    public static DeleteGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmRecoveryPlanRequest self = new DeleteGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
