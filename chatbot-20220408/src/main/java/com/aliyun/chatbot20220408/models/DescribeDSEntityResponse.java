// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDSEntityResponseBody body;

    public static DescribeDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSEntityResponse self = new DescribeDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDSEntityResponse setBody(DescribeDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSEntityResponseBody getBody() {
        return this.body;
    }

}
