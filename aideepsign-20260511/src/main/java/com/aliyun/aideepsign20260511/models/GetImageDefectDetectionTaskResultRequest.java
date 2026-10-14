// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageDefectDetectionTaskResultRequest extends TeaModel {
    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task ID returned by <code>CreateImageDefectDetectionTask</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageDefectDetectionTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageDefectDetectionTaskResultRequest self = new GetImageDefectDetectionTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetImageDefectDetectionTaskResultRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetImageDefectDetectionTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
