// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSpeechResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceSpeechResponseBody body;

    public static QueryDeviceSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSpeechResponse self = new QueryDeviceSpeechResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceSpeechResponse setBody(QueryDeviceSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceSpeechResponseBody getBody() {
        return this.body;
    }

}
