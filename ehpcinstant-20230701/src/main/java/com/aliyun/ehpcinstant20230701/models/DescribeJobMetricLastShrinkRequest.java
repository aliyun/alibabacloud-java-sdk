// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricLastShrinkRequest extends TeaModel {
    @NameInMap("ArrayIndex")
    public String arrayIndexShrink;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TaskName")
    public String taskName;

    public static DescribeJobMetricLastShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricLastShrinkRequest self = new DescribeJobMetricLastShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricLastShrinkRequest setArrayIndexShrink(String arrayIndexShrink) {
        this.arrayIndexShrink = arrayIndexShrink;
        return this;
    }
    public String getArrayIndexShrink() {
        return this.arrayIndexShrink;
    }

    public DescribeJobMetricLastShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeJobMetricLastShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
