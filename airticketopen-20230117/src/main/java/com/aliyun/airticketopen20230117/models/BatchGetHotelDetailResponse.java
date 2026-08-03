// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BatchGetHotelDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetHotelDetailResponseBody body;

    public static BatchGetHotelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetHotelDetailResponse self = new BatchGetHotelDetailResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetHotelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetHotelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetHotelDetailResponse setBody(BatchGetHotelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetHotelDetailResponseBody getBody() {
        return this.body;
    }

}
