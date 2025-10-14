// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDetectionRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dr-ha1i09ob3zmqrs85****</p>
     */
    @NameInMap("DetectionRuleId")
    public String detectionRuleId;

    /**
     * <strong>example:</strong>
     * <p>5CC09D0C-1CD7-54BD-A853-DCB2D945****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDetectionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionRuleResponseBody self = new CreateDetectionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDetectionRuleResponseBody setDetectionRuleId(String detectionRuleId) {
        this.detectionRuleId = detectionRuleId;
        return this;
    }
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    public CreateDetectionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
