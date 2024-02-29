// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelSceneBookItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHotelSceneBookItemResponseBody body;

    public static DeleteHotelSceneBookItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelSceneBookItemResponse self = new DeleteHotelSceneBookItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotelSceneBookItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotelSceneBookItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHotelSceneBookItemResponse setBody(DeleteHotelSceneBookItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotelSceneBookItemResponseBody getBody() {
        return this.body;
    }

}
