// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentWorkspaceMemberRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoK****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The prefix of the member ID to query.</p>
     * 
     * <strong>example:</strong>
     * <p>20273</p>
     */
    @NameInMap("SearchMemberId")
    public String searchMemberId;

    /**
     * <p>The prefix of the member name to query.</p>
     * 
     * <strong>example:</strong>
     * <p>yunqi</p>
     */
    @NameInMap("SearchRoleName")
    public String searchRoleName;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentWorkspaceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentWorkspaceMemberRequest self = new ListDataAgentWorkspaceMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentWorkspaceMemberRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ListDataAgentWorkspaceMemberRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentWorkspaceMemberRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentWorkspaceMemberRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDataAgentWorkspaceMemberRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDataAgentWorkspaceMemberRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentWorkspaceMemberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentWorkspaceMemberRequest setSearchMemberId(String searchMemberId) {
        this.searchMemberId = searchMemberId;
        return this;
    }
    public String getSearchMemberId() {
        return this.searchMemberId;
    }

    public ListDataAgentWorkspaceMemberRequest setSearchRoleName(String searchRoleName) {
        this.searchRoleName = searchRoleName;
        return this;
    }
    public String getSearchRoleName() {
        return this.searchRoleName;
    }

    public ListDataAgentWorkspaceMemberRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
