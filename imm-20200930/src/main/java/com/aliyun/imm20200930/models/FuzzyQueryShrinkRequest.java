// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For more information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The maximum number of files to return. Valid values: 0 to 200.</p>
     * <p>If you do not set this parameter or set it to 0, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token used for pagination when the total number of files exceeds the value of MaxResults.</p>
     * <p>The list of file information is returned in lexicographical order starting from NextToken.</p>
     * <p>Set this parameter to empty when you call this operation for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order of the sort fields. Valid values:</p>
     * <ul>
     * <li><p>asc: Ascending order.</p>
     * </li>
     * <li><p>desc: Descending order. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can separate multiple sort orders with commas (,), such as asc,desc.</li>
     * <li>The number of sort orders cannot exceed the number of sort fields. That is, the number of elements in the Order parameter must be less than or equal to the number of elements in the Sort parameter. For example, if Sort is set to Size,Filename, Order can be set to desc or asc.</li>
     * <li>If the number of sort orders is less than the number of sort fields, the default sort order for the unspecified fields is asc. For example, if Sort is set to Size,Filename and Order is set to asc, the default sort order for Filename is asc, which means ascending order.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asc,desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The string used for the query. The string cannot exceed 1 MB in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The list of fields by which to sort the results. For more information, see the <a href="https://help.aliyun.com/document_detail/2743991.html">list of supported fields and operators</a>.</p>
     * <ul>
     * <li><p>You can separate multiple sort fields with commas (,), such as <code>Size,Filename</code>.</p>
     * </li>
     * <li><p>You can specify up to 5 sort fields.</p>
     * </li>
     * <li><p>The order of the sort fields determines the sorting priority.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Size,Filename</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies the fields to return. Only the values of the specified fields are returned instead of all existing metadata fields. You can use this parameter to reduce the size of the returned struct.</p>
     * <p>If you do not specify this parameter or leave it empty, all fields are returned.</p>
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
