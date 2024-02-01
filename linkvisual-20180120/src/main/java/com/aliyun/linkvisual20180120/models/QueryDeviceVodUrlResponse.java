// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceVodUrlResponseBody body;

    public static QueryDeviceVodUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlResponse self = new QueryDeviceVodUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceVodUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceVodUrlResponse setBody(QueryDeviceVodUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceVodUrlResponseBody getBody() {
        return this.body;
    }

}
