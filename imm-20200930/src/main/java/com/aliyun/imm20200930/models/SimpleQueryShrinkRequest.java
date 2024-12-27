// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryShrinkRequest extends TeaModel {
    /**
     * <p>The aggregations.</p>
     * <blockquote>
     * <p> If you perform an aggregate query, the aggregation returned in the response contains only statistical results, not the actual metadata.</p>
     * </blockquote>
     */
    @NameInMap("Aggregations")
    public String aggregationsShrink;

    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <ul>
     * <li>If the Aggregations parameter is not specified, this parameter specifies the maximum number of files that can be returned. Valid values: 1 to 100.</li>
     * <li>If the Aggregations parameter is specified, this parameter specifies the maximum number of aggregation groups that can be returned. Valid values: 0 to 2000.</li>
     * <li>If you do not specify this parameter or set the parameter to 0, the default value of 100 is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter.</p>
     * <p>The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
     * <p>You do not need to specify this parameter in your initial request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>asc: sorts the results in ascending order.</p>
     * </li>
     * <li><p>desc: sorts the results in descending order. This is the default value.</p>
     * </li>
     * <li><p>You can specify multiple sort orders that are separated by commas. Example: asc,desc.</p>
     * </li>
     * <li><p>The number of elements in the Order parameter must be less than or equal to the number of elements in the Sort parameter. For example, if the value of the Sort parameter is Size,Filename, you can set the Order parameter to desc,asc.</p>
     * </li>
     * <li><p>If the number of sort orders is less than the number of sort fields, the sort fields for which no sorting orders are explicitly specified use the asc order by default. For example, if you set Sort to Size,Filename and Order to asc, the Filename field defaults to the value of asc.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc,desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Query")
    public String queryShrink;

    /**
     * <p>The sort fields. For more information, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you specify multiple sort fields, separate them with commas (,), as in Size,Filename.</p>
     * </li>
     * <li><p>You can specify up to five sort fields.</p>
     * </li>
     * <li><p>The order of the sort fields determines their precedence in the sorting process.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Size,Filename</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The fields that you want to include in the response. You can use this parameter to reduce the size of the response.</p>
     * <p>If you do not specify this parameter or leave this parameter empty, the operation returns all metadata fields.</p>
     */
    @NameInMap("WithFields")
    public String withFieldsShrink;

    /**
     * <p>Specifies whether to return the total number of hits. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
