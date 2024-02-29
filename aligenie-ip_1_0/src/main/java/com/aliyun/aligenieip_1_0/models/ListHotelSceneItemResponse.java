// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelSceneItemResponseBody body;

    public static ListHotelSceneItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemResponse self = new ListHotelSceneItemResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelSceneItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelSceneItemResponse setBody(ListHotelSceneItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelSceneItemResponseBody getBody() {
        return this.body;
    }

}
