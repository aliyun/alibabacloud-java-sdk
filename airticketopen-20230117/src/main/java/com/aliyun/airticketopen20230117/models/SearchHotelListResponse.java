// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchHotelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchHotelListResponseBody body;

    public static SearchHotelListResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchHotelListResponse self = new SearchHotelListResponse();
        return TeaModel.build(map, self);
    }

    public SearchHotelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchHotelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchHotelListResponse setBody(SearchHotelListResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchHotelListResponseBody getBody() {
        return this.body;
    }

}
