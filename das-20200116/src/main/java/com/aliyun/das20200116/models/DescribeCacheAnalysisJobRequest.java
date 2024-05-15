// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the cache analysis task. You can obtain the task ID from the response parameters of the [CreateCacheAnalysisJob](https://help.aliyun.com/document_detail/180982.html) operation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeCacheAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobRequest self = new DescribeCacheAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCacheAnalysisJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
