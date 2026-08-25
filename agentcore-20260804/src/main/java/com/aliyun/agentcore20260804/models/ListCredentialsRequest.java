// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>apiKey</p>
     */
    @NameInMap("credentialType")
    public String credentialType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
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
