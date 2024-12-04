// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The instances.</p>
     */
    @NameInMap("TaskInstances")
    public String taskInstancesShrink;

    public static UpdateTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskInstancesShrinkRequest self = new UpdateTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskInstancesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateTaskInstancesShrinkRequest setTaskInstancesShrink(String taskInstancesShrink) {
        this.taskInstancesShrink = taskInstancesShrink;
        return this;
    }
    public String getTaskInstancesShrink() {
        return this.taskInstancesShrink;
    }

}
