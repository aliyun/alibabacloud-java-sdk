// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkLogAnalyzeTaskResponseBody extends TeaModel {
    /**
     * <p>The information about the Spark log analysis task.</p>
     */
    @NameInMap("Data")
    public SparkAnalyzeLogTask data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF5AF5B-C803-1861-A0FF-63666A557709</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillSparkLogAnalyzeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSparkLogAnalyzeTaskResponseBody self = new KillSparkLogAnalyzeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSparkLogAnalyzeTaskResponseBody setData(SparkAnalyzeLogTask data) {
        this.data = data;
        return this;
    }
    public SparkAnalyzeLogTask getData() {
        return this.data;
    }

    public KillSparkLogAnalyzeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
