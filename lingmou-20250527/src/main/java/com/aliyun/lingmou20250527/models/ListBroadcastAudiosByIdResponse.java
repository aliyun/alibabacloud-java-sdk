// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastAudiosByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBroadcastAudiosByIdResponseBody body;

    public static ListBroadcastAudiosByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastAudiosByIdResponse self = new ListBroadcastAudiosByIdResponse();
        return TeaModel.build(map, self);
    }

    public ListBroadcastAudiosByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBroadcastAudiosByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBroadcastAudiosByIdResponse setBody(ListBroadcastAudiosByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBroadcastAudiosByIdResponseBody getBody() {
        return this.body;
    }

}
