// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNetTestResultsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxno4vh5muoq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListNetTestResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetTestResultsRequest self = new ListNetTestResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListNetTestResultsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListNetTestResultsRequest setNetTestType(String netTestType) {
        this.netTestType = netTestType;
        return this;
    }
    public String getNetTestType() {
        return this.netTestType;
    }

    public ListNetTestResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetTestResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
