// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginPoolsRequest extends TeaModel {
    /**
     * <p>Specifies how to match the origin pool name. The default is <code>exact</code>. Valid values:</p>
     * <ul>
     * <li><p><code>fuzzy</code>: Performs a fuzzy search.</p>
     * </li>
     * <li><p><code>exact</code>: Performs an exact match.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The name of the origin pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies how the results are sorted. By default, results are sorted by ID in descending order. To sort by ID in ascending order, set this parameter to <code>id</code>. IDs increase with creation time.</p>
     * <ul>
     * <li><p>id: Sorts by ID in descending order.</p>
     * </li>
     * <li><p>id: Sorts by ID in ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value must be an integer from 1 to 500. If you specify a value greater than 500, the system uses 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The site ID. To get this ID, call the <a href="~~ListSites~~">ListSites</a> operation.</p>
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
