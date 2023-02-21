// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkSQLEngineResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static KillSparkSQLEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSparkSQLEngineResponseBody self = new KillSparkSQLEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSparkSQLEngineResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public KillSparkSQLEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
