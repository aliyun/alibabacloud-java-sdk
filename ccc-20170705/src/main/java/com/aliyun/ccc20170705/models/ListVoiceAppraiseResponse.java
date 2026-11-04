// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListVoiceAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceAppraiseResponseBody body;

    public static ListVoiceAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAppraiseResponse self = new ListVoiceAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceAppraiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceAppraiseResponse setBody(ListVoiceAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceAppraiseResponseBody getBody() {
        return this.body;
    }

}
