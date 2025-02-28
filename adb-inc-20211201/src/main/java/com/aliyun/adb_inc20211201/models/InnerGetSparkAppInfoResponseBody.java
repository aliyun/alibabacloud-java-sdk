// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public SparkAppInfo data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerGetSparkAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppInfoResponseBody self = new InnerGetSparkAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppInfoResponseBody setData(SparkAppInfo data) {
        this.data = data;
        return this;
    }
    public SparkAppInfo getData() {
        return this.data;
    }

    public InnerGetSparkAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
