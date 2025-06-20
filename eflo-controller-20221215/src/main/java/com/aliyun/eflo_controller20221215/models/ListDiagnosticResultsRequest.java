// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListDiagnosticResultsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NetDiag</p>
     */
    @NameInMap("DiagType")
    public String diagType;

    /**
     * <ul>
     * <li></li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmywpvugkh7kq</p>
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
