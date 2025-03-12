// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkWarehouseBatchSQLResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public SparkBatchSQL data;

    /**
     * <strong>example:</strong>
     * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteSparkWarehouseBatchSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkWarehouseBatchSQLResponseBody self = new ExecuteSparkWarehouseBatchSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkWarehouseBatchSQLResponseBody setData(SparkBatchSQL data) {
        this.data = data;
        return this;
    }
    public SparkBatchSQL getData() {
        return this.data;
    }

    public ExecuteSparkWarehouseBatchSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
