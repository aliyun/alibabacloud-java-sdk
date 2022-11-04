// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelListByAkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotelListByAkResponseBody body;

    public static QueryHotelListByAkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelListByAkResponse self = new QueryHotelListByAkResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotelListByAkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotelListByAkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotelListByAkResponse setBody(QueryHotelListByAkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotelListByAkResponseBody getBody() {
        return this.body;
    }

}
