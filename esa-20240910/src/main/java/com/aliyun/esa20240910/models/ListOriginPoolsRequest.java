// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginPoolsRequest extends TeaModel {
    /**
     * <p>Type of name match query, supporting the following two types, with exact match as the default.</p>
     * <ul>
     * <li>fuzzy: Fuzzy query.</li>
     * <li>exact: Exact query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>Name of the origin pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Sorting, supports ascending and descending order by ID, default is descending by ID, which is positively correlated with creation time.</p>
     * <ul>
     * <li>-id: Sort by ID in descending order.</li>
     * <li>id: Sort by ID in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>Page number, default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, an integer greater than 0, with a maximum of 500. If the value exceeds 500, it will be set to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>151538882642832</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListOriginPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOriginPoolsRequest self = new ListOriginPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListOriginPoolsRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public ListOriginPoolsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListOriginPoolsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListOriginPoolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOriginPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOriginPoolsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
