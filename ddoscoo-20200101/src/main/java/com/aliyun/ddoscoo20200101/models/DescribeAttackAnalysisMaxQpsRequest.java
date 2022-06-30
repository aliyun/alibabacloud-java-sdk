// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisMaxQpsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAttackAnalysisMaxQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisMaxQpsRequest self = new DescribeAttackAnalysisMaxQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisMaxQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAttackAnalysisMaxQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
