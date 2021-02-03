// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmRecoveryPlanResponse self = new UpdateGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmRecoveryPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
