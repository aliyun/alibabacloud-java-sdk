// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageTaskResultRequest extends TeaModel {
    /**
     * <p>The task ID returned by <code>CreateImageTask</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageTaskResultRequest self = new GetImageTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetImageTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
