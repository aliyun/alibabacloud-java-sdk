// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePerspectiveResponseBody body;

    public static DescribePerspectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePerspectiveResponse self = new DescribePerspectiveResponse();
        return TeaModel.build(map, self);
    }

    public DescribePerspectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePerspectiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePerspectiveResponse setBody(DescribePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePerspectiveResponseBody getBody() {
        return this.body;
    }

}
