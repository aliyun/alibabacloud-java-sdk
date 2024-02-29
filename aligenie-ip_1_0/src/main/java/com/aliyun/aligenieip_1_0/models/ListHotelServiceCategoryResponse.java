// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelServiceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelServiceCategoryResponseBody body;

    public static ListHotelServiceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelServiceCategoryResponse self = new ListHotelServiceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelServiceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelServiceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelServiceCategoryResponse setBody(ListHotelServiceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelServiceCategoryResponseBody getBody() {
        return this.body;
    }

}
