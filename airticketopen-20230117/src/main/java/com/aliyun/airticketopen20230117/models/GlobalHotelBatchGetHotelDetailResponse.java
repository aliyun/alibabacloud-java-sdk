// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelBatchGetHotelDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelBatchGetHotelDetailResponseBody body;

    public static GlobalHotelBatchGetHotelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelBatchGetHotelDetailResponse self = new GlobalHotelBatchGetHotelDetailResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelBatchGetHotelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelBatchGetHotelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelBatchGetHotelDetailResponse setBody(GlobalHotelBatchGetHotelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelBatchGetHotelDetailResponseBody getBody() {
        return this.body;
    }

}
