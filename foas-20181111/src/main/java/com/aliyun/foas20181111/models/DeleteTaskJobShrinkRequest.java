// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteTaskJobShrinkRequest extends TeaModel {
    @NameInMap("jobIds")
    public String jobIdsShrink;

    public static DeleteTaskJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskJobShrinkRequest self = new DeleteTaskJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskJobShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

}
