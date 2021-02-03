// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmRecoveryPlanResponse self = new DeleteGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmRecoveryPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
