// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDetectionRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B88A2D41-87B8-537E-A7D3-3416A39F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDetectionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionRuleResponseBody self = new UpdateDetectionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
