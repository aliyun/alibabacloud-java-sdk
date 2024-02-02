// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpeechPushJobDeviceResponseBody body;

    public static QuerySpeechPushJobDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobDeviceResponse self = new QuerySpeechPushJobDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechPushJobDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechPushJobDeviceResponse setBody(QuerySpeechPushJobDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechPushJobDeviceResponseBody getBody() {
        return this.body;
    }

}
