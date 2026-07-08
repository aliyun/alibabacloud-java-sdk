// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWarehouseRequest extends TeaModel {
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
    public java.util.List<String> warehouseInstanceIds;

    /**
     * <p>A list of warehouse types.</p>
     * 
     * <strong>example:</strong>
     * <p>pcaCaCert</p>
     */
    @NameInMap("WarehouseTypes")
    public java.util.List<String> warehouseTypes;

    public static ListWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseRequest self = new ListWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public ListWarehouseRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWarehouseRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWarehouseRequest setWarehouseInstanceIds(java.util.List<String> warehouseInstanceIds) {
        this.warehouseInstanceIds = warehouseInstanceIds;
        return this;
    }
    public java.util.List<String> getWarehouseInstanceIds() {
        return this.warehouseInstanceIds;
    }

    public ListWarehouseRequest setWarehouseTypes(java.util.List<String> warehouseTypes) {
        this.warehouseTypes = warehouseTypes;
        return this;
    }
    public java.util.List<String> getWarehouseTypes() {
        return this.warehouseTypes;
    }

}
