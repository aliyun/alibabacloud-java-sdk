// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEpnInstanceResponseBody body;

    public static DeleteEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEpnInstanceResponse self = new DeleteEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEpnInstanceResponse setBody(DeleteEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
