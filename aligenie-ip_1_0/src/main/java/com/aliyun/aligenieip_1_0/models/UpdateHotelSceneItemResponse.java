// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHotelSceneItemResponseBody body;

    public static UpdateHotelSceneItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneItemResponse self = new UpdateHotelSceneItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotelSceneItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotelSceneItemResponse setBody(UpdateHotelSceneItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotelSceneItemResponseBody getBody() {
        return this.body;
    }

}
