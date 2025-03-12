// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSparkWarehouseBatchSQLResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Data")
    public SparkBatchSQL data;

    /**
     * <strong>example:</strong>
     * <p>771C5FAA-530F-52F7-B84D-EBAD45***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelSparkWarehouseBatchSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkWarehouseBatchSQLResponseBody self = new CancelSparkWarehouseBatchSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelSparkWarehouseBatchSQLResponseBody setData(SparkBatchSQL data) {
        this.data = data;
        return this;
    }
    public SparkBatchSQL getData() {
        return this.data;
    }

    public CancelSparkWarehouseBatchSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
