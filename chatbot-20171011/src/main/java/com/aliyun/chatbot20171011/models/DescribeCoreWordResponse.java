// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCoreWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCoreWordResponseBody body;

    public static DescribeCoreWordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCoreWordResponse self = new DescribeCoreWordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCoreWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCoreWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCoreWordResponse setBody(DescribeCoreWordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCoreWordResponseBody getBody() {
        return this.body;
    }

}
