// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryRequest extends TeaModel {
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
    public java.util.List<String> mediaTypes;

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
    public java.util.List<String> withFields;

    public static SemanticQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SemanticQueryRequest self = new SemanticQueryRequest();
        return TeaModel.build(map, self);
    }

    public SemanticQueryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SemanticQueryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SemanticQueryRequest setMediaTypes(java.util.List<String> mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }
    public java.util.List<String> getMediaTypes() {
        return this.mediaTypes;
    }

    public SemanticQueryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SemanticQueryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SemanticQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SemanticQueryRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public SemanticQueryRequest setWithFields(java.util.List<String> withFields) {
        this.withFields = withFields;
        return this;
    }
    public java.util.List<String> getWithFields() {
        return this.withFields;
    }

}
