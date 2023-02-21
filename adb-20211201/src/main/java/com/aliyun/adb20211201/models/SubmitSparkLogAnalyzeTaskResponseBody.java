// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkLogAnalyzeTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public SparkAnalyzeLogTask data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSparkLogAnalyzeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkLogAnalyzeTaskResponseBody self = new SubmitSparkLogAnalyzeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSparkLogAnalyzeTaskResponseBody setData(SparkAnalyzeLogTask data) {
        this.data = data;
        return this;
    }
    public SparkAnalyzeLogTask getData() {
        return this.data;
    }

    public SubmitSparkLogAnalyzeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
