// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiAgentRegisterInfosRequest extends TeaModel {
    /**
     * <p>The display name of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>测试Agent</p>
     */
    @NameInMap("AgentDisplayName")
    public String agentDisplayName;

    /**
     * <p>The host address of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <p>The Agent ID, which is uniformly assigned by CNNIC after real-name verification through CNNIC. The AgentID serves as the unique identifier that binds the Agent to the real-name verified registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>liuq@azt400</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The version of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Minimum value: 1. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size for the paged query. This parameter specifies the number of entries per page for paging.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>活跃</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAtiAgentRegisterInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAtiAgentRegisterInfosRequest self = new ListAtiAgentRegisterInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListAtiAgentRegisterInfosRequest setAgentDisplayName(String agentDisplayName) {
        this.agentDisplayName = agentDisplayName;
        return this;
    }
    public String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    public ListAtiAgentRegisterInfosRequest setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public ListAtiAgentRegisterInfosRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListAtiAgentRegisterInfosRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ListAtiAgentRegisterInfosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListAtiAgentRegisterInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAtiAgentRegisterInfosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAtiAgentRegisterInfosRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiAgentRegisterInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiAgentRegisterInfosRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
