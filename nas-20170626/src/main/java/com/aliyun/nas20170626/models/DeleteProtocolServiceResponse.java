// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteProtocolServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProtocolServiceResponseBody body;

    public static DeleteProtocolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtocolServiceResponse self = new DeleteProtocolServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProtocolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProtocolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProtocolServiceResponse setBody(DeleteProtocolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtocolServiceResponseBody getBody() {
        return this.body;
    }

}
