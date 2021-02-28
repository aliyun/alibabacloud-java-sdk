// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCoreWordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCoreWordResponse setBody(DescribeCoreWordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCoreWordResponseBody getBody() {
        return this.body;
    }

}
