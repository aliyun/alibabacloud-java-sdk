// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobsShrinkRequest extends TeaModel {
    @NameInMap("ExecutorIds")
    public String executorIdsShrink;

    @NameInMap("JobSpec")
    public String jobSpecShrink;

    public static DeleteJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsShrinkRequest self = new DeleteJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public DeleteJobsShrinkRequest setJobSpecShrink(String jobSpecShrink) {
        this.jobSpecShrink = jobSpecShrink;
        return this;
    }
    public String getJobSpecShrink() {
        return this.jobSpecShrink;
    }

}
