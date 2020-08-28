// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PreviewGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public Long recoveryPlanId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static PreviewGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewGtmRecoveryPlanRequest self = new PreviewGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

}
