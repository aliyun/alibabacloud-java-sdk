// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetWatermarkExtractTaskResultRequest extends TeaModel {
    /**
     * <p>A reserved idempotence field. This field is not supported. Passing in a value does not cause an error, but it does not produce an idempotence effect.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dark watermark task ID returned by the CreateWatermarkExtractTask operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetWatermarkExtractTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkExtractTaskResultRequest self = new GetWatermarkExtractTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetWatermarkExtractTaskResultRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetWatermarkExtractTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
