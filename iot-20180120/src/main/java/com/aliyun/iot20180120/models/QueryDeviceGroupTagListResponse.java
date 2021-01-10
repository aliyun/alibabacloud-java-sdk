// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupTagListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceGroupTagListResponseBody body;

    public static QueryDeviceGroupTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupTagListResponse self = new QueryDeviceGroupTagListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupTagListResponse setBody(QueryDeviceGroupTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupTagListResponseBody getBody() {
        return this.body;
    }

}
