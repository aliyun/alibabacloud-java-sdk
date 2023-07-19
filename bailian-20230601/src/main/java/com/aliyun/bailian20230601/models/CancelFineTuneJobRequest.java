// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CancelFineTuneJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("JobId")
    public String jobId;

    public static CancelFineTuneJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFineTuneJobRequest self = new CancelFineTuneJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelFineTuneJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelFineTuneJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
