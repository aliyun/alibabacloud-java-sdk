// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryBatchStatusRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryBatchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchStatusRequest self = new QueryBatchStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchStatusRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryBatchStatusRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryBatchStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
