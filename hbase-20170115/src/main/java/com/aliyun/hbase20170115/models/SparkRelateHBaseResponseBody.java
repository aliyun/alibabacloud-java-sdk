// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class SparkRelateHBaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SparkRelateHBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SparkRelateHBaseResponseBody self = new SparkRelateHBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SparkRelateHBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
