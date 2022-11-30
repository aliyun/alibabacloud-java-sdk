// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceTtsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVoiceTtsResponseBody body;

    public static ListVoiceTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceTtsResponse self = new ListVoiceTtsResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceTtsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceTtsResponse setBody(ListVoiceTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceTtsResponseBody getBody() {
        return this.body;
    }

}
