// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InsertHotelSceneBookItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertHotelSceneBookItemResponseBody body;

    public static InsertHotelSceneBookItemResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertHotelSceneBookItemResponse self = new InsertHotelSceneBookItemResponse();
        return TeaModel.build(map, self);
    }

    public InsertHotelSceneBookItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertHotelSceneBookItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertHotelSceneBookItemResponse setBody(InsertHotelSceneBookItemResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertHotelSceneBookItemResponseBody getBody() {
        return this.body;
    }

}
