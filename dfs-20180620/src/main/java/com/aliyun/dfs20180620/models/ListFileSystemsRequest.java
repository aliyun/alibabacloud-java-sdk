// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFileSystemsRequest extends TeaModel {
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
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token. If a query does not return all directories, a non-empty NextToken is returned. You can specify the NextToken in the next request to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>CreateTime: Sorts the results by creation time. This is the default value.</li>
     * <li>FileSystemName: Sorts the results by file system name.</li>
     * <li>SpaceCapacity: Sorts the results by file system capacity budget.</li>
     * <li>UsedSpaceSize: Sorts the results by file system used space.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>ASC: Ascending order. This is the default value.</li>
     * <li>DESC: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>Specifies the starting position of the query. Default value: 1.</p>
     * 
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
