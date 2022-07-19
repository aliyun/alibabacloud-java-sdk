// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteJobsShrinkRequest extends TeaModel {
    // 任务Id
    @NameInMap("JobIds")
    public String jobIdsShrink;

    public static DeleteJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsShrinkRequest self = new DeleteJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

}
