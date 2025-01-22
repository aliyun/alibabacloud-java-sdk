// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Tasks")
    public String tasksShrink;

    public static BatchUpdateTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTasksShrinkRequest self = new BatchUpdateTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTasksShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public BatchUpdateTasksShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

}
