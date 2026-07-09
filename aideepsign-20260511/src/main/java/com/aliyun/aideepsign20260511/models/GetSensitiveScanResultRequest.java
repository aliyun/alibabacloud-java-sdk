// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetSensitiveScanResultRequest extends TeaModel {
    /**
     * <p>The task ID returned by <code>CreateSensitiveScanTask</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetSensitiveScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveScanResultRequest self = new GetSensitiveScanResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSensitiveScanResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
