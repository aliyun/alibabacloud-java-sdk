// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryDevicesDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicesDownloadUrlResponseBody body;

    public static QueryDevicesDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesDownloadUrlResponse self = new QueryDevicesDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicesDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicesDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicesDownloadUrlResponse setBody(QueryDevicesDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicesDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
