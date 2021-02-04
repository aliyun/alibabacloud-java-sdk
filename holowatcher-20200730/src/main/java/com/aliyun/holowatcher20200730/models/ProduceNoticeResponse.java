// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProduceNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProduceNoticeResponseBody body;

    public static ProduceNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        ProduceNoticeResponse self = new ProduceNoticeResponse();
        return TeaModel.build(map, self);
    }

    public ProduceNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProduceNoticeResponse setBody(ProduceNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public ProduceNoticeResponseBody getBody() {
        return this.body;
    }

}
