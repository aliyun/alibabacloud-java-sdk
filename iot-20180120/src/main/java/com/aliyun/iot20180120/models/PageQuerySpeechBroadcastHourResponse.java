// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySpeechBroadcastHourResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageQuerySpeechBroadcastHourResponseBody body;

    public static PageQuerySpeechBroadcastHourResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySpeechBroadcastHourResponse self = new PageQuerySpeechBroadcastHourResponse();
        return TeaModel.build(map, self);
    }

    public PageQuerySpeechBroadcastHourResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQuerySpeechBroadcastHourResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQuerySpeechBroadcastHourResponse setBody(PageQuerySpeechBroadcastHourResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQuerySpeechBroadcastHourResponseBody getBody() {
        return this.body;
    }

}
