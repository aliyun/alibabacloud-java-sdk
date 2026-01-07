// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class GetLabelTaskResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>196118</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>03s1Xmp791KUMYuZVEb</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetLabelTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTaskResultRequest self = new GetLabelTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetLabelTaskResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetLabelTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
