// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricLastRequest extends TeaModel {
    @NameInMap("ArrayIndex")
    public java.util.List<Integer> arrayIndex;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TaskName")
    public String taskName;

    public static DescribeJobMetricLastRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricLastRequest self = new DescribeJobMetricLastRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricLastRequest setArrayIndex(java.util.List<Integer> arrayIndex) {
        this.arrayIndex = arrayIndex;
        return this;
    }
    public java.util.List<Integer> getArrayIndex() {
        return this.arrayIndex;
    }

    public DescribeJobMetricLastRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeJobMetricLastRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
