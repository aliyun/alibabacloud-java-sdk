// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330.models;

import com.aliyun.tea.*;

public class QueryDatabotResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public Long costTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static QueryDatabotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabotResponseBody self = new QueryDatabotResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatabotResponseBody setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public QueryDatabotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatabotResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
