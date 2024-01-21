// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocumentImportJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("JobId")
    public String jobId;

    public static DescribeDocumentImportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentImportJobRequest self = new DescribeDocumentImportJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentImportJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DescribeDocumentImportJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
