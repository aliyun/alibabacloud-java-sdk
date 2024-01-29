// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeFaqResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaqResponseBody body;

    public static DescribeFaqResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaqResponse self = new DescribeFaqResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaqResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaqResponse setBody(DescribeFaqResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaqResponseBody getBody() {
        return this.body;
    }

}
