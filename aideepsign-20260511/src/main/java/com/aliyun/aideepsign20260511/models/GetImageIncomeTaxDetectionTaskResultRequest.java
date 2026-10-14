// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageIncomeTaxDetectionTaskResultRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task ID returned by <code>CreateImageIncomeTaxDetectionTask</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageIncomeTaxDetectionTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageIncomeTaxDetectionTaskResultRequest self = new GetImageIncomeTaxDetectionTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetImageIncomeTaxDetectionTaskResultRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetImageIncomeTaxDetectionTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
