// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StartOffset")
    public Integer startOffset;

    public static ListFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemsRequest self = new ListFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public ListFileSystemsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListFileSystemsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFileSystemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFileSystemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListFileSystemsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListFileSystemsRequest setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }
    public Integer getStartOffset() {
        return this.startOffset;
    }

}
