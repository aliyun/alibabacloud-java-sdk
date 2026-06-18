// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBranchesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. It is not required for the first query. For subsequent queries, use the NextToken returned from the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. The value must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>10</li>
     * <li>20</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent branch ID, used to specify the parent branch for a new branch or as a query filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>br-main</p>
     */
    @NameInMap("ParentBranchId")
    public String parentBranchId;

    /**
     * <p>The region ID. Must be specified when creating a primary branch. When creating a sub-branch, it inherits the region of the primary branch by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The search keyword. Supports fuzzy search by branch ID or branch name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <p>The sort field.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>BranchName: Sort by branch name.</li>
     * <li>CreateTime: Sort by creation time.</li>
     * <li>LastRunTime: Sort by last run time.</li>
     * </ul>
     * <p>Default value: CreateTime.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort direction.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Asc: Ascending order.</li>
     * <li>Desc: Descending order.</li>
     * </ul>
     * <p>Default value: Desc.</p>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListBranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBranchesRequest self = new ListBranchesRequest();
        return TeaModel.build(map, self);
    }

    public ListBranchesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBranchesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBranchesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBranchesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBranchesRequest setParentBranchId(String parentBranchId) {
        this.parentBranchId = parentBranchId;
        return this;
    }
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    public ListBranchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBranchesRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListBranchesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListBranchesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
