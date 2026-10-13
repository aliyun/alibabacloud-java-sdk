// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNetTestResultsRequest extends TeaModel {
    /**
     * <p>The number of entries per page in a paged query. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If this parameter is not specified or is set to a value less than 20, the default value is 20.</p>
     * </li>
     * <li><p>If this parameter is set to a value greater than 100, the default value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The network test type.</p>
     * 
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that is returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b5679****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxno4vh5****</p>
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
