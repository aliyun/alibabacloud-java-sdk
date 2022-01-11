// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BidDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BidDomainResponseBody body;

    public static BidDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BidDomainResponse self = new BidDomainResponse();
        return TeaModel.build(map, self);
    }

    public BidDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BidDomainResponse setBody(BidDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BidDomainResponseBody getBody() {
        return this.body;
    }

}
