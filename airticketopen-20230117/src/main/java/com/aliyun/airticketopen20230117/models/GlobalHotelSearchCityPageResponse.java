// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelSearchCityPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelSearchCityPageResponseBody body;

    public static GlobalHotelSearchCityPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelSearchCityPageResponse self = new GlobalHotelSearchCityPageResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelSearchCityPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelSearchCityPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelSearchCityPageResponse setBody(GlobalHotelSearchCityPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelSearchCityPageResponseBody getBody() {
        return this.body;
    }

}
