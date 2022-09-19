// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public SparkAppInfo data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppInfoResponseBody self = new GetSparkAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppInfoResponseBody setData(SparkAppInfo data) {
        this.data = data;
        return this;
    }
    public SparkAppInfo getData() {
        return this.data;
    }

    public GetSparkAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
