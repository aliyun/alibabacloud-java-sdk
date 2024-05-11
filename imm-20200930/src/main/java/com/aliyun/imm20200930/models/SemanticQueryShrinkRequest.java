// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MediaTypes")
    public String mediaTypesShrink;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("WithFields")
    public String withFieldsShrink;

    public static SemanticQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SemanticQueryShrinkRequest self = new SemanticQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SemanticQueryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SemanticQueryShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SemanticQueryShrinkRequest setMediaTypesShrink(String mediaTypesShrink) {
        this.mediaTypesShrink = mediaTypesShrink;
        return this;
    }
    public String getMediaTypesShrink() {
        return this.mediaTypesShrink;
    }

    public SemanticQueryShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SemanticQueryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SemanticQueryShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SemanticQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
