// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SemanticQueryRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Query")
    public String query;

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

}
