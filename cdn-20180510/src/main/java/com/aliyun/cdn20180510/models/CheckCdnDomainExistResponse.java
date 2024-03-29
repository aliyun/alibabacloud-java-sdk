// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainExistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCdnDomainExistResponseBody body;

    public static CheckCdnDomainExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCdnDomainExistResponse self = new CheckCdnDomainExistResponse();
        return TeaModel.build(map, self);
    }

    public CheckCdnDomainExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCdnDomainExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCdnDomainExistResponse setBody(CheckCdnDomainExistResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCdnDomainExistResponseBody getBody() {
        return this.body;
    }

}
