// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageTagsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AcrImage</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>crr-3gqhkza0wbxxxxxx</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static ListAcrImageTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageTagsRequest self = new ListAcrImageTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListAcrImageTagsRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public ListAcrImageTagsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAcrImageTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAcrImageTagsRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
