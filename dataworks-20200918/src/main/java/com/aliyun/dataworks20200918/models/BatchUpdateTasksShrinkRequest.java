// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksShrinkRequest extends TeaModel {
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
