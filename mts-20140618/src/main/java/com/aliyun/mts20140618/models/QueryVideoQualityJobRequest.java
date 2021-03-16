// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoQualityJobRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("JobId")
    public String jobId;

    public static QueryVideoQualityJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoQualityJobRequest self = new QueryVideoQualityJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoQualityJobRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryVideoQualityJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
