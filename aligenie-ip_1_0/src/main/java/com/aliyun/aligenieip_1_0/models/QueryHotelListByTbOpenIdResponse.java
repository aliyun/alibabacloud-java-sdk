// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelListByTbOpenIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotelListByTbOpenIdResponseBody body;

    public static QueryHotelListByTbOpenIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelListByTbOpenIdResponse self = new QueryHotelListByTbOpenIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotelListByTbOpenIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotelListByTbOpenIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotelListByTbOpenIdResponse setBody(QueryHotelListByTbOpenIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotelListByTbOpenIdResponseBody getBody() {
        return this.body;
    }

}
