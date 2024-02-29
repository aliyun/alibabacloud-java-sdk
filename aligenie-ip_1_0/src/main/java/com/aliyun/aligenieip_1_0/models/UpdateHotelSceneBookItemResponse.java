// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneBookItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHotelSceneBookItemResponseBody body;

    public static UpdateHotelSceneBookItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneBookItemResponse self = new UpdateHotelSceneBookItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneBookItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotelSceneBookItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotelSceneBookItemResponse setBody(UpdateHotelSceneBookItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotelSceneBookItemResponseBody getBody() {
        return this.body;
    }

}
