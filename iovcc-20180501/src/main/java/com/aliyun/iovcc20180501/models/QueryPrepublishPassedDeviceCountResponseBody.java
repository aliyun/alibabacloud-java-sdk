// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class QueryPrepublishPassedDeviceCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Count")
    public Integer count;

    public static QueryPrepublishPassedDeviceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepublishPassedDeviceCountResponseBody self = new QueryPrepublishPassedDeviceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPrepublishPassedDeviceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPrepublishPassedDeviceCountResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
