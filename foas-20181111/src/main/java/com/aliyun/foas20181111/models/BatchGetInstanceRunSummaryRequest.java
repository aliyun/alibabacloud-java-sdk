// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BatchGetInstanceRunSummaryRequest extends TeaModel {
    @NameInMap("jobNames")
    public String jobNames;

    @NameInMap("jobType")
    public String jobType;

    public static BatchGetInstanceRunSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetInstanceRunSummaryRequest self = new BatchGetInstanceRunSummaryRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetInstanceRunSummaryRequest setJobNames(String jobNames) {
        this.jobNames = jobNames;
        return this;
    }
    public String getJobNames() {
        return this.jobNames;
    }

    public BatchGetInstanceRunSummaryRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

}
