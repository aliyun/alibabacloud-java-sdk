// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesRequest extends TeaModel {
    /**
     * <p>The ID of the access group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

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
     * <p>Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token for the next page.</p>
     * <p>If a single query does not return all entries, a non-empty NextToken is returned. You can specify the NextToken in a subsequent query to continue the query.</p>
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
     * <li>Priority (default): sort by priority</li>
     * <li>CreateTime: sort by creation time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Priority</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order of the returned results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC (default): ascending order</li>
     * <li>DESC: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>Specifies the starting position of the query.</p>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StartOffset")
    public Integer startOffset;

    public static ListAccessRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessRulesRequest self = new ListAccessRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessRulesRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ListAccessRulesRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListAccessRulesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAccessRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessRulesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListAccessRulesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAccessRulesRequest setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }
    public Integer getStartOffset() {
        return this.startOffset;
    }

}
