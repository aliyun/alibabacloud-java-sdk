// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
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

}
