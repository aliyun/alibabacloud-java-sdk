// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public Long recoveryPlanId;

    public static DescribeGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanRequest self = new DescribeGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

}
