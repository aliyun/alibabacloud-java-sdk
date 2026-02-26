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
     * 
     * <strong>example:</strong>
     * <p>Scenery of Hangzhou in April 2021</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <blockquote>
     * <p>Either this parameter or the Query parameter must be specified. This parameter is valid only for image searches on datasets configured with a search-by-image workflow.</p>
     * </blockquote>
     * <p>URI of the source data for retrieval.
     * The URI must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that contains the file name extension.</p>
     * <p>Contact us if you need to configure a workflow template.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <blockquote>
     * <p> Either this parameter or the SourceURI parameter must be specified.</p>
     * </blockquote>
     * <p>The content of the query that you input.</p>
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
