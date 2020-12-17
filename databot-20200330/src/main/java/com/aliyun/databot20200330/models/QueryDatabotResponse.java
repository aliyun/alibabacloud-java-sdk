// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330.models;

import com.aliyun.tea.*;

public class QueryDatabotResponse extends TeaModel {
    @NameInMap("CostTime")
    @Validation(required = true)
    public Long costTime;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.Map<String, ?> data;

    public static QueryDatabotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabotResponse self = new QueryDatabotResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabotResponse setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public QueryDatabotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatabotResponse setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
