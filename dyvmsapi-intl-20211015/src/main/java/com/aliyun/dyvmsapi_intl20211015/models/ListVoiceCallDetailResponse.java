// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceCallDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVoiceCallDetailResponseBody body;

    public static ListVoiceCallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCallDetailResponse self = new ListVoiceCallDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceCallDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceCallDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceCallDetailResponse setBody(ListVoiceCallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceCallDetailResponseBody getBody() {
        return this.body;
    }

}
