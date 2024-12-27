// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteAirEcsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAirEcsInstanceResponseBody body;

    public static DeleteAirEcsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAirEcsInstanceResponse self = new DeleteAirEcsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAirEcsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAirEcsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAirEcsInstanceResponse setBody(DeleteAirEcsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAirEcsInstanceResponseBody getBody() {
        return this.body;
    }

}
