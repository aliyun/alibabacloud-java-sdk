// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DomainSpecialBizCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DomainSpecialBizCancelResponseBody body;

    public static DomainSpecialBizCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        DomainSpecialBizCancelResponse self = new DomainSpecialBizCancelResponse();
        return TeaModel.build(map, self);
    }

    public DomainSpecialBizCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DomainSpecialBizCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DomainSpecialBizCancelResponse setBody(DomainSpecialBizCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public DomainSpecialBizCancelResponseBody getBody() {
        return this.body;
    }

}
