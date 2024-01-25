// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAccountForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccountForInnerResponseBody body;

    public static CheckAccountForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountForInnerResponse self = new CheckAccountForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountForInnerResponse setBody(CheckAccountForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountForInnerResponseBody getBody() {
        return this.body;
    }

}
