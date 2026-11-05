// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessGroupsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token.</p>
     * <p>If a single query does not return all results, a non-empty NextToken is returned. You can include the NextToken in the next request to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field by which to sort the returned results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreateTime (default): sorts the results by creation time.</li>
     * <li>AccessGroupName: sorts the results by access group name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order of the returned results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC (default): ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>Specifies the starting position of the query.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StartOffset")
    public Integer startOffset;

    public static ListAccessGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessGroupsRequest self = new ListAccessGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessGroupsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListAccessGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAccessGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessGroupsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListAccessGroupsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAccessGroupsRequest setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }
    public Integer getStartOffset() {
        return this.startOffset;
    }

}
