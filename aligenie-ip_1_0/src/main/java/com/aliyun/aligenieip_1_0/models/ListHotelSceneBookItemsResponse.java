// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotelSceneBookItemsResponseBody body;

    public static ListHotelSceneBookItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneBookItemsResponse self = new ListHotelSceneBookItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneBookItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelSceneBookItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelSceneBookItemsResponse setBody(ListHotelSceneBookItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelSceneBookItemsResponseBody getBody() {
        return this.body;
    }

}
