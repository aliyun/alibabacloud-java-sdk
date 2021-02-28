// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePerspectiveResponse setBody(DescribePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePerspectiveResponseBody getBody() {
        return this.body;
    }

}
