// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobStatusRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The ID of the document parsing task. You can obtain the ID by calling CreateDocParserJob.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job_abc123</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDocParserJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobStatusRequest self = new DescribeDocParserJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobStatusRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public DescribeDocParserJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDocParserJobStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
