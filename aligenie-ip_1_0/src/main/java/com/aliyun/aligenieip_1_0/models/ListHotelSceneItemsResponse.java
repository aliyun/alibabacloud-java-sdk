// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelSceneItemsResponseBody body;

    public static ListHotelSceneItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemsResponse self = new ListHotelSceneItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelSceneItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelSceneItemsResponse setBody(ListHotelSceneItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelSceneItemsResponseBody getBody() {
        return this.body;
    }

}
