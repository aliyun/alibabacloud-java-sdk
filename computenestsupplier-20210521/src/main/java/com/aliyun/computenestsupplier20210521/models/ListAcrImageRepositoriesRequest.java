// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageRepositoriesRequest extends TeaModel {
    /**
     * <p>The type of the artifact. Default value: AcrImage. Valid values:</p>
     * <ul>
     * <li>HelmChart: Helm chart image.</li>
     * <li>AcrImage: container image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AcrImage</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>wordpress</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    public static ListAcrImageRepositoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageRepositoriesRequest self = new ListAcrImageRepositoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAcrImageRepositoriesRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public ListAcrImageRepositoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAcrImageRepositoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAcrImageRepositoriesRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

}
