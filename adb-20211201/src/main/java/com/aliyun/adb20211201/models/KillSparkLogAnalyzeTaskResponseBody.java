// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkLogAnalyzeTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public SparkAnalyzeLogTask data;

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
