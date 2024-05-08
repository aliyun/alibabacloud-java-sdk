// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AssociateRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateRoomResponseBody body;

    public static AssociateRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRoomResponse self = new AssociateRoomResponse();
        return TeaModel.build(map, self);
    }

    public AssociateRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateRoomResponse setBody(AssociateRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRoomResponseBody getBody() {
        return this.body;
    }

}
