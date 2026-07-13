// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmRecoveryPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>575A3E3A-E9FC-5435-9CAD-BD89533E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmRecoveryPlanResponseBody self = new UpdateGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
