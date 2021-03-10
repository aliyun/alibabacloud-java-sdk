// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceGroupByDeviceResponseBody body;

    public static QueryDeviceGroupByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByDeviceResponse self = new QueryDeviceGroupByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupByDeviceResponse setBody(QueryDeviceGroupByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupByDeviceResponseBody getBody() {
        return this.body;
    }

}
