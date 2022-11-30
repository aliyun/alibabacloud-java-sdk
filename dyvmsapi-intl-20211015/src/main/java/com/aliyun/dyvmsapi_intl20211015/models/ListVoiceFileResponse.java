// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVoiceFileResponseBody body;

    public static ListVoiceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceFileResponse self = new ListVoiceFileResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceFileResponse setBody(ListVoiceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceFileResponseBody getBody() {
        return this.body;
    }

}
