// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsRequest extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("MaxResult")
    public String maxResult;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListArtifactVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactVersionsRequest self = new ListArtifactVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactVersionsRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ListArtifactVersionsRequest setMaxResult(String maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public String getMaxResult() {
        return this.maxResult;
    }

    public ListArtifactVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
