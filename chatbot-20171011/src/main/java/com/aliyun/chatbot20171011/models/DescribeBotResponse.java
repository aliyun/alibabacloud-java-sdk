// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeBotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBotResponseBody body;

    public static DescribeBotResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotResponse self = new DescribeBotResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBotResponse setBody(DescribeBotResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBotResponseBody getBody() {
        return this.body;
    }

}
