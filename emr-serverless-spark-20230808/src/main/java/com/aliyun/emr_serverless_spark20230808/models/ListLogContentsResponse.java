// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLogContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogContentsResponseBody body;

    public static ListLogContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogContentsResponse self = new ListLogContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogContentsResponse setBody(ListLogContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogContentsResponseBody getBody() {
        return this.body;
    }

}
