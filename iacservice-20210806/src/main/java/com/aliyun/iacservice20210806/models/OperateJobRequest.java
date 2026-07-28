// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class OperateJobRequest extends TeaModel {
    /**
     * <p>The description. The length is 0 to 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dasd</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>Task: regular task (default).</li>
     * <li>SceneTestingTask: scenario-based testing task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static OperateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateJobRequest self = new OperateJobRequest();
        return TeaModel.build(map, self);
    }

    public OperateJobRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public OperateJobRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
