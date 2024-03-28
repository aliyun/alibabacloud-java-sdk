// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpSetResponseBody body;

    public static DeleteIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetResponse self = new DeleteIpSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpSetResponse setBody(DeleteIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpSetResponseBody getBody() {
        return this.body;
    }

}
