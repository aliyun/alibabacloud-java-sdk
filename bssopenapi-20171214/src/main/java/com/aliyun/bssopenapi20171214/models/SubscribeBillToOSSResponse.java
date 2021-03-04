// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubscribeBillToOSSResponseBody body;

    public static SubscribeBillToOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeBillToOSSResponse self = new SubscribeBillToOSSResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeBillToOSSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeBillToOSSResponse setBody(SubscribeBillToOSSResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeBillToOSSResponseBody getBody() {
        return this.body;
    }

}
