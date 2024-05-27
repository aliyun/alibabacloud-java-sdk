// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the disaster recovery plan that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    public static DescribeGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanRequest self = new DescribeGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
