// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsShrinkRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIdsShrink;

    public static GetJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobsShrinkRequest self = new GetJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetJobsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

}
