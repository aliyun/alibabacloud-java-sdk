// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset. You can obtain the name of the dataset from the response of the <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of entries to return. Valid values: 0 to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the total number of files is greater than the value of MaxResults, you must specify NextToken.</p>
     * <p>The file information is returned in alphabetical order starting from the value of NextToken.</p>
     * <p>You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc (default): descending order.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Separate multiple sorting methods with commas (,). Example: asc,desc.</p>
     * </li>
     * <li><p>The number of values for Order must be less than or equal to the number of values for Sort. For example, if you set Sort to Size,Filename, you can set Order only to desc or asc.</p>
     * </li>
     * <li><p>If the number of values for Order is less than the number of values for Sort, the unsorted fields are default to the value of asc. For example, if you set Sort to Size,Filename and Order to asc, the Filename field is default to the value of asc.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc,desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The query content. The value can be up to 1 MB in size.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The sort fields. For more information, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
     * <ul>
     * <li>Separate multiple sort fields with commas (,). Example: <code>Size,Filename</code>.</li>
     * <li>You can specify up to five sort fields.</li>
     * <li>The priority order of sorting is determined based on the order of the sort fields.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Size,Filename</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The fields that you want to include in the response. To help reduce the size of the response, include only necessary metadata fields.</p>
     * <p>If you do not specify this parameter or set the value to null, all existing metadata fields are returned.</p>
     */
    @NameInMap("WithFields")
    public String withFieldsShrink;

    public static FuzzyQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FuzzyQueryShrinkRequest self = new FuzzyQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FuzzyQueryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public FuzzyQueryShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public FuzzyQueryShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FuzzyQueryShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public FuzzyQueryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public FuzzyQueryShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public FuzzyQueryShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public FuzzyQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

}
