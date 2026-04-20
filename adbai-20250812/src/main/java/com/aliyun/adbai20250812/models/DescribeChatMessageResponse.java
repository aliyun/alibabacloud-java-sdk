// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChatMessageResponseBody body;

    public static DescribeChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChatMessageResponse self = new DescribeChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChatMessageResponse setBody(DescribeChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChatMessageResponseBody getBody() {
        return this.body;
    }

}
