// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventBusesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. You can use this parameter together with NextToken to implement pagination.</p>
     * <blockquote>
     * <p>Notice: The maximum number of entries returned per request is 100.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name prefix of the event buses to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>My</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>The pagination token. If the specified Limit is reached and more results are available, this token is returned. You can use this token together with Limit to implement pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group, used to filter event buses in the specified resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListEventBusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventBusesRequest self = new ListEventBusesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventBusesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventBusesRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventBusesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventBusesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
