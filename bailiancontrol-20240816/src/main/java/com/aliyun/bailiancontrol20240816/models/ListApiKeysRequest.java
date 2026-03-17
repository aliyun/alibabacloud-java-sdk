// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class ListApiKeysRequest extends TeaModel {
    @NameInMap("apiKeyId")
    public String apiKeyId;

    @NameInMap("description")
    public String description;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("skip")
    public Integer skip;

    @NameInMap("uid")
    public String uid;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysRequest self = new ListApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListApiKeysRequest setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public ListApiKeysRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApiKeysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiKeysRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListApiKeysRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ListApiKeysRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
