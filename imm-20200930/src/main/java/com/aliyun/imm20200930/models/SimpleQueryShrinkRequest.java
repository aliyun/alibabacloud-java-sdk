// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryShrinkRequest extends TeaModel {
    /**
     * <p>The list of aggregation field information.</p>
     * <blockquote>
     * <p>Notice: When you use an aggregation query, only the aggregation results are returned, and the list of matched metadata is not returned.</notice></p>
     * </blockquote>
     */
    @NameInMap("Aggregations")
    public String aggregationsShrink;

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
     * <ul>
     * <li><p>When you perform a query for files without specifying the Aggregations parameter, this parameter specifies the maximum number of files to return. Valid values: 0 to 100.</p>
     * </li>
     * <li><p>When you specify the Aggregations parameter for aggregation statistics, this parameter specifies the maximum number of groups to return. Valid values: 0 to 2000.</p>
     * </li>
     * <li><p>If you do not specify this parameter or set it to 0, the default value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used for pagination when the total number of files exceeds the value of MaxResults.</p>
     * <p>The list of files is returned in lexicographical order starting from NextToken.</p>
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
     * <li><p>asc: ascending order</p>
     * </li>
     * <li><p>desc: descending order (default)</p>
     * <blockquote>
     * <ul>
     * <li>You can separate multiple sort orders with commas (,), for example, asc,desc.</li>
     * <li>The number of sort orders cannot exceed the number of sort fields. That is, the number of elements in the Order parameter must be less than or equal to the number of elements in the Sort parameter. For example, if Sort is set to Size,Filename, Order can be set to &quot;asc,desc&quot;.</li>
     * <li>If the number of sort orders is less than the number of sort fields, the default sort order for the unspecified fields is desc. For example, if Sort is set to Size,Filename and Order is set to asc, the default sort order for Filename is desc, which means descending order.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>The simple query conditions. Click the link on the left to view details.</p>
     */
    @NameInMap("Query")
    public String queryShrink;

    /**
     * <p>The list of sort fields. For more information, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
     * <blockquote>
     * <ul>
     * <li>You can separate multiple sort fields with commas (,), for example, Size,Filename.</li>
     * <li>You can specify a maximum of 5 sort fields.</li>
     * <li>The order of the sort fields determines the sorting priority.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Size,Filename</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies the specific fields to return instead of all existing metadata fields. This can be used to reduce the size of the returned struct.</p>
     * <p>If you do not specify this parameter or leave it empty, all fields are returned.</p>
     */
    @NameInMap("WithFields")
    public String withFieldsShrink;

    /**
     * <p>Specifies whether to return the total number of matched records. Valid values:</p>
     * <ul>
     * <li>true: The TotalHits field is not returned.</li>
     * <li>false: The TotalHits field is returned.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutTotalHits")
    public Boolean withoutTotalHits;

    public static SimpleQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryShrinkRequest self = new SimpleQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SimpleQueryShrinkRequest setAggregationsShrink(String aggregationsShrink) {
        this.aggregationsShrink = aggregationsShrink;
        return this;
    }
    public String getAggregationsShrink() {
        return this.aggregationsShrink;
    }

    public SimpleQueryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SimpleQueryShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SimpleQueryShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SimpleQueryShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SimpleQueryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SimpleQueryShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

    public SimpleQueryShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public SimpleQueryShrinkRequest setWithFieldsShrink(String withFieldsShrink) {
        this.withFieldsShrink = withFieldsShrink;
        return this;
    }
    public String getWithFieldsShrink() {
        return this.withFieldsShrink;
    }

    public SimpleQueryShrinkRequest setWithoutTotalHits(Boolean withoutTotalHits) {
        this.withoutTotalHits = withoutTotalHits;
        return this;
    }
    public Boolean getWithoutTotalHits() {
        return this.withoutTotalHits;
    }

}
