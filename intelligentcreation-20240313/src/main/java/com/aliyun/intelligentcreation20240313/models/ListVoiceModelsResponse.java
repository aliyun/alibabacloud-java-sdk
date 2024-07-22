// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListVoiceModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceModelsResponseBody body;

    public static ListVoiceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceModelsResponse self = new ListVoiceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceModelsResponse setBody(ListVoiceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceModelsResponseBody getBody() {
        return this.body;
    }

}
