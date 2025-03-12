// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNetTestResultsRequest extends TeaModel {
    /**
     * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If no value is set or the set value is less than 20, the default is 20.</p>
     * </li>
     * <li><p>If the set value is greater than 100, the default is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>Type of network test.</p>
     * 
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <p>Query token (Token), which should be the value of the NextToken parameter returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Resource group ID</p>
     * 
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
