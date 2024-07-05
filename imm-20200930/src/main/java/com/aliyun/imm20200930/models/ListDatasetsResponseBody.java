// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    @NameInMap("Datasets")
    public java.util.List<Dataset> datasets;

    /**
     * <strong>example:</strong>
     * <p>12345678:immtest:dataset002</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>FEEDE356-C928-4A36-951A-6EB5A592****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setDatasets(java.util.List<Dataset> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<Dataset> getDatasets() {
        return this.datasets;
    }

    public ListDatasetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
