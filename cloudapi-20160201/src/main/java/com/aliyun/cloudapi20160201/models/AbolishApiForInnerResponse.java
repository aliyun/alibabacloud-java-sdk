// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class AbolishApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishApiForInnerResponseBody body;

    public static AbolishApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishApiForInnerResponse self = new AbolishApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public AbolishApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishApiForInnerResponse setBody(AbolishApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishApiForInnerResponseBody getBody() {
        return this.body;
    }

}
