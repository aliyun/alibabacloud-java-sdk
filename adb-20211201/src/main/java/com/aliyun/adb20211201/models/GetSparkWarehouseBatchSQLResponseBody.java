// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkWarehouseBatchSQLResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;DBClusterId\&quot;: \&quot;amv-uf6485635fz852mn\&quot;, \&quot;Statements\&quot;: [{\&quot;Code\&quot;: \&quot;show databases\&quot;, \&quot;State\&quot;: \&quot;FINISHED\&quot;, \&quot;StatementId\&quot;: \&quot;sq202501141001sh8e12e080006846-0000\&quot;, \&quot;Result\&quot;: \&quot;+--------------------+n</p>
     */
    @NameInMap("Data")
    public SparkBatchSQL data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D44EDA0-A9DC-580D-9B5A-019370C075F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkWarehouseBatchSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkWarehouseBatchSQLResponseBody self = new GetSparkWarehouseBatchSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkWarehouseBatchSQLResponseBody setData(SparkBatchSQL data) {
        this.data = data;
        return this;
    }
    public SparkBatchSQL getData() {
        return this.data;
    }

    public GetSparkWarehouseBatchSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
