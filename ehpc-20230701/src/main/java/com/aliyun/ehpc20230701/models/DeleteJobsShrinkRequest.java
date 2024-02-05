// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class DeleteJobsShrinkRequest extends TeaModel {
    @NameInMap("JobSpec")
    public String jobSpecShrink;

    public static DeleteJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsShrinkRequest self = new DeleteJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsShrinkRequest setJobSpecShrink(String jobSpecShrink) {
        this.jobSpecShrink = jobSpecShrink;
        return this;
    }
    public String getJobSpecShrink() {
        return this.jobSpecShrink;
    }

}
