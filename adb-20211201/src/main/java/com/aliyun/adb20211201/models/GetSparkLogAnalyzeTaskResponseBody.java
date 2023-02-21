// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkLogAnalyzeTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public SparkAnalyzeLogTask data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkLogAnalyzeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLogAnalyzeTaskResponseBody self = new GetSparkLogAnalyzeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkLogAnalyzeTaskResponseBody setData(SparkAnalyzeLogTask data) {
        this.data = data;
        return this;
    }
    public SparkAnalyzeLogTask getData() {
        return this.data;
    }

    public GetSparkLogAnalyzeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
