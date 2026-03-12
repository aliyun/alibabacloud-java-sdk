// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetYikeAIAppJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cec2c13da767c090,ca3d3c9737f04586</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    public static BatchGetYikeAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAIAppJobRequest self = new BatchGetYikeAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAIAppJobRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
