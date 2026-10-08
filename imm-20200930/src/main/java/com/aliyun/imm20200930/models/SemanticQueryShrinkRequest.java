// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryShrinkRequest extends TeaModel {
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
    public String mediaTypesShrink;

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
