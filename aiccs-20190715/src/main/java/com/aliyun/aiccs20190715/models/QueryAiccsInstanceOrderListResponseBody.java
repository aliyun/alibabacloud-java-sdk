// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAiccsInstanceOrderListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAiccsInstanceOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiccsInstanceOrderListResponseBody self = new QueryAiccsInstanceOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiccsInstanceOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiccsInstanceOrderListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryAiccsInstanceOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
