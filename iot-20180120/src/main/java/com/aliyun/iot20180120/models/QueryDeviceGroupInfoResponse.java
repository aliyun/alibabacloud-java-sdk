// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceGroupInfoResponseBody body;

    public static QueryDeviceGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoResponse self = new QueryDeviceGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupInfoResponse setBody(QueryDeviceGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupInfoResponseBody getBody() {
        return this.body;
    }

}
