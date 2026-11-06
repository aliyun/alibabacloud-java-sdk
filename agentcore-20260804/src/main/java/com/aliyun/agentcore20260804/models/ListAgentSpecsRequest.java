// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentSpecsRequest extends TeaModel {
    /**
     * <p>The name of the AgentSpec, used as a search keyword in combination with the search parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>my-worker</p>
     */
    @NameInMap("agentSpecName")
    public String agentSpecName;

    /**
     * <p>The business tag used for fuzzy filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>ai</p>
     */
    @NameInMap("bizTag")
    public String bizTag;

    /**
     * <p>The field by which to sort the results. Supports download_count. By default, the results are sorted by update time.</p>
     * 
     * <strong>example:</strong>
     * <p>download_count</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The owner filter.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The visibility scope filter. Valid values: PUBLIC and PRIVATE.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The search mode. Valid values: accurate (exact match) and blur (fuzzy match). Default value: blur.</p>
     * 
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <p>Specifies whether to return the lists of skills and MCP servers. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withCapabilities")
    public Boolean withCapabilities;

    public static ListAgentSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpecsRequest self = new ListAgentSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSpecsRequest setAgentSpecName(String agentSpecName) {
        this.agentSpecName = agentSpecName;
        return this;
    }
    public String getAgentSpecName() {
        return this.agentSpecName;
    }

    public ListAgentSpecsRequest setBizTag(String bizTag) {
        this.bizTag = bizTag;
        return this;
    }
    public String getBizTag() {
        return this.bizTag;
    }

    public ListAgentSpecsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListAgentSpecsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListAgentSpecsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAgentSpecsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentSpecsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListAgentSpecsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListAgentSpecsRequest setWithCapabilities(Boolean withCapabilities) {
        this.withCapabilities = withCapabilities;
        return this;
    }
    public Boolean getWithCapabilities() {
        return this.withCapabilities;
    }

}
