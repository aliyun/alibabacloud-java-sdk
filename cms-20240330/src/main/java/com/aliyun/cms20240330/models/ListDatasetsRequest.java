// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_dataset</p>
     */
    @NameInMap("datasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>d9a48d977f45aa6fcf6981ed13b885b3fab0b124c12dcbbe70edce5d81ba****************</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListDatasetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
