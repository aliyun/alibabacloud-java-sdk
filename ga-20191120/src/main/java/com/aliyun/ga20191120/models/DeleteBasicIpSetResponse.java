// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBasicIpSetResponseBody body;

    public static DeleteBasicIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicIpSetResponse self = new DeleteBasicIpSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicIpSetResponse setBody(DeleteBasicIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicIpSetResponseBody getBody() {
        return this.body;
    }

}
