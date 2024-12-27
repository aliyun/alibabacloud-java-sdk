// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QuerySimilarImageClustersRequest extends TeaModel {
    /**
     * <p>The custom tags, which are used to filter tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;val&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public String customLabels;

    /**
     * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The number of entries per page. Value range: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <p>If the total number of clusters is greater than the value of MaxResults, you must specify this parameter. The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
     * <blockquote>
     * <p> The first time you call this operation in a query, set this parameter to null.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KClVwZGF0ZVRpbWUQARgBIs8ECgkAAJLUwUCAQ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc: descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The sorting field.</p>
     * <ul>
     * <li>CreateTime: the time when the clusters were created.</li>
     * <li>UpdateTime: the time when the clusters were updated. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    public static QuerySimilarImageClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySimilarImageClustersRequest self = new QuerySimilarImageClustersRequest();
        return TeaModel.build(map, self);
    }

    public QuerySimilarImageClustersRequest setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public QuerySimilarImageClustersRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public QuerySimilarImageClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QuerySimilarImageClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QuerySimilarImageClustersRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QuerySimilarImageClustersRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QuerySimilarImageClustersRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
