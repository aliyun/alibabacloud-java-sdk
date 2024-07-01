// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class LoadSampleDataSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2ze0z517o1mgp66a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FA31BE84-ABE8-554A-A769-5F860C34EE10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LoadSampleDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadSampleDataSetResponseBody self = new LoadSampleDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadSampleDataSetResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public LoadSampleDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
