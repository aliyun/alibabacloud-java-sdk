// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpeechDeviceResponseBody body;

    public static QuerySpeechDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechDeviceResponse self = new QuerySpeechDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechDeviceResponse setBody(QuerySpeechDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechDeviceResponseBody getBody() {
        return this.body;
    }

}
