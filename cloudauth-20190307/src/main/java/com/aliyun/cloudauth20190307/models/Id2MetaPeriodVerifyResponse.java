// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id2MetaPeriodVerifyResponseBody body;

    public static Id2MetaPeriodVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyResponse self = new Id2MetaPeriodVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaPeriodVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaPeriodVerifyResponse setBody(Id2MetaPeriodVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaPeriodVerifyResponseBody getBody() {
        return this.body;
    }

}
