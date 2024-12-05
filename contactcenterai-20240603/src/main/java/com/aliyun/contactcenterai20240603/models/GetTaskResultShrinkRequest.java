// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetTaskResultShrinkRequest extends TeaModel {
    @NameInMap("requiredFieldList")
    public String requiredFieldListShrink;

    /**
     * <strong>example:</strong>
     * <p>20240905-********-93E9-5D45-B4EF-045743A34071</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetTaskResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultShrinkRequest self = new GetTaskResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskResultShrinkRequest setRequiredFieldListShrink(String requiredFieldListShrink) {
        this.requiredFieldListShrink = requiredFieldListShrink;
        return this;
    }
    public String getRequiredFieldListShrink() {
        return this.requiredFieldListShrink;
    }

    public GetTaskResultShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
