// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobResultRequest extends TeaModel {
    /**
     * <p>The agent name.</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The document parsing task ID, obtained by calling CreateDocParserJob.</p>
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

    /**
     * <p>The result type.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    public static DescribeDocParserJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobResultRequest self = new DescribeDocParserJobResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobResultRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public DescribeDocParserJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDocParserJobResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDocParserJobResultRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

}
