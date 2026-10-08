// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of data records to return in this request. Value range: (0,100].</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The media types to search. If this parameter is left empty, the default value is:</p>
     */
    @NameInMap("MediaTypes")
    public java.util.List<String> mediaTypes;

    /**
     * <p>This parameter is no longer provided.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved. Not supported yet.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p><notice>Either this parameter or the SourceURI parameter must be specified.</notice>
     * The content for semantic search.</p>
     * 
     * <strong>example:</strong>
     * <p>Scenery of Hangzhou in April 2021</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p><notice>Either this parameter or the Query parameter must be specified. This parameter is currently valid only when the search type is specified as image and the dataset is configured with a workflow template for image-to-image search.</notice>
     * The storage address of the source data used for retrieval. The storage address supports OSS URIs.</p>
     * <p>The OSS address format is oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket that resides in the same region as the current project, and ${Object} is the full path of the file including the file name extension.</p>
     * <p>If you need to configure the corresponding workflow template, <a href="https://help.aliyun.com/document_detail/84454.html">contact us</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Specifies the specific fields to return instead of all existing metadata fields. This helps reduce the size of the returned struct.</p>
     * <p>If this parameter is left empty, all fields are returned.</p>
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
