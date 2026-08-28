// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAgentRegisterInfoMarketRequest extends TeaModel {
    /**
     * <p>The endpoint domain name through which the agent provides services externally.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <p>The agent version.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0.1</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TrustLevel")
    public String trustLevel;

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

    public DescribeAtiAgentRegisterInfoMarketRequest setTrustLevel(String trustLevel) {
        this.trustLevel = trustLevel;
        return this;
    }
    public String getTrustLevel() {
        return this.trustLevel;
    }

}
