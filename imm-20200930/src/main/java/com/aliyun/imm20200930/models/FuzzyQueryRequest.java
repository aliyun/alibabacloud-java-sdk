// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FuzzyQueryRequest extends TeaModel {
    // Dataset 名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 用于搜索的字符串
    @NameInMap("Query")
    public String query;

    public static FuzzyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FuzzyQueryRequest self = new FuzzyQueryRequest();
        return TeaModel.build(map, self);
    }

    public FuzzyQueryRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public FuzzyQueryRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public FuzzyQueryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FuzzyQueryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public FuzzyQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
