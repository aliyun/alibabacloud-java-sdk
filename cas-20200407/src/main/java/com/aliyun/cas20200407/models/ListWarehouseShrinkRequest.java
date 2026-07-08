// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWarehouseShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token from a previous response. Use this token to retrieve the next page of results. Omit this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>A list of warehouse instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-wh-uc-gl2bsq</p>
     */
    @NameInMap("WarehouseInstanceIds")
    public String warehouseInstanceIdsShrink;

    /**
     * <p>A list of warehouse types.</p>
     * 
     * <strong>example:</strong>
     * <p>pcaCaCert</p>
     */
    @NameInMap("WarehouseTypes")
    public String warehouseTypesShrink;

    public static ListWarehouseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseShrinkRequest self = new ListWarehouseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWarehouseShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWarehouseShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWarehouseShrinkRequest setWarehouseInstanceIdsShrink(String warehouseInstanceIdsShrink) {
        this.warehouseInstanceIdsShrink = warehouseInstanceIdsShrink;
        return this;
    }
    public String getWarehouseInstanceIdsShrink() {
        return this.warehouseInstanceIdsShrink;
    }

    public ListWarehouseShrinkRequest setWarehouseTypesShrink(String warehouseTypesShrink) {
        this.warehouseTypesShrink = warehouseTypesShrink;
        return this;
    }
    public String getWarehouseTypesShrink() {
        return this.warehouseTypesShrink;
    }

}
