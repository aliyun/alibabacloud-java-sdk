// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    /**
     * <p>Filters by credential type. Currently, only apiKey is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>apiKey</p>
     */
    @NameInMap("credentialType")
    public String credentialType;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 100. If this parameter is not specified, 10 records are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Filters by credential name.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialxxx</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The fuzzy match filter condition for credential names.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The pagination token for the next page. Do not specify this parameter for the first request. For subsequent requests, set this parameter to the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsRequest self = new ListCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListCredentialsRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public ListCredentialsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCredentialsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListCredentialsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
