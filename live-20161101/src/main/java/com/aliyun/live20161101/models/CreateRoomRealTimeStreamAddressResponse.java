// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomRealTimeStreamAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoomRealTimeStreamAddressResponseBody body;

    public static CreateRoomRealTimeStreamAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRealTimeStreamAddressResponse self = new CreateRoomRealTimeStreamAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoomRealTimeStreamAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoomRealTimeStreamAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoomRealTimeStreamAddressResponse setBody(CreateRoomRealTimeStreamAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoomRealTimeStreamAddressResponseBody getBody() {
        return this.body;
    }

}
