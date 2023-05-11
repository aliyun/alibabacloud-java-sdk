// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelRoomDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotelRoomDetailResponseBody body;

    public static QueryHotelRoomDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelRoomDetailResponse self = new QueryHotelRoomDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotelRoomDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotelRoomDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotelRoomDetailResponse setBody(QueryHotelRoomDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotelRoomDetailResponseBody getBody() {
        return this.body;
    }

}
