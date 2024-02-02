// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CountSpeechBroadcastHourResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountSpeechBroadcastHourResponseBody body;

    public static CountSpeechBroadcastHourResponse build(java.util.Map<String, ?> map) throws Exception {
        CountSpeechBroadcastHourResponse self = new CountSpeechBroadcastHourResponse();
        return TeaModel.build(map, self);
    }

    public CountSpeechBroadcastHourResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountSpeechBroadcastHourResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountSpeechBroadcastHourResponse setBody(CountSpeechBroadcastHourResponseBody body) {
        this.body = body;
        return this;
    }
    public CountSpeechBroadcastHourResponseBody getBody() {
        return this.body;
    }

}
