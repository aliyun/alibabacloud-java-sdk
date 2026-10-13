// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListDiagnosticResultsRequest extends TeaModel {
    /**
     * <p>The diagnostic type.</p>
     * 
     * <strong>example:</strong>
     * <p>NetDiag</p>
     */
    @NameInMap("DiagType")
    public String diagType;

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
     * <p>The pagination token. Set this parameter to the value of NextToken that was returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmywpvugk****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListDiagnosticResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticResultsRequest self = new ListDiagnosticResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticResultsRequest setDiagType(String diagType) {
        this.diagType = diagType;
        return this;
    }
    public String getDiagType() {
        return this.diagType;
    }

    public ListDiagnosticResultsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListDiagnosticResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnosticResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
