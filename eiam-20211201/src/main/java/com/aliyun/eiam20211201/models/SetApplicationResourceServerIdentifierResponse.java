// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationResourceServerIdentifierResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationResourceServerIdentifierResponseBody body;

    public static SetApplicationResourceServerIdentifierResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationResourceServerIdentifierResponse self = new SetApplicationResourceServerIdentifierResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationResourceServerIdentifierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationResourceServerIdentifierResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationResourceServerIdentifierResponse setBody(SetApplicationResourceServerIdentifierResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationResourceServerIdentifierResponseBody getBody() {
        return this.body;
    }

}
