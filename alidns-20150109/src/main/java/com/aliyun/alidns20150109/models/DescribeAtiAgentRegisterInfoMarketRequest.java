// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAgentRegisterInfoMarketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <strong>example:</strong>
     * <p>5.0.1</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeAtiAgentRegisterInfoMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAgentRegisterInfoMarketRequest self = new DescribeAtiAgentRegisterInfoMarketRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAgentRegisterInfoMarketRequest setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public DescribeAtiAgentRegisterInfoMarketRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DescribeAtiAgentRegisterInfoMarketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeAtiAgentRegisterInfoMarketRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAtiAgentRegisterInfoMarketRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
