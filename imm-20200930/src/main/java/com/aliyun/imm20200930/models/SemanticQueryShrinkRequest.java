// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immDatatest</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The types of the media that you want to query. Default value:</p>
     * <p>[&quot;image&quot;]</p>
     */
    @NameInMap("MediaTypes")
    public String mediaTypesShrink;

    /**
     * <p>This parameter is no longer available.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The content of the query that you input.</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The fields that you want to include in the response. Including only necessary metadata fields can help reduce the size of the response.</p>
     * <p>If you do not specify this parameter or set the value to null, all existing metadata fields are returned.</p>
     */
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

    public SemanticQueryShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public SemanticQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
