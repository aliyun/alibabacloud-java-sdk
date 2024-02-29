// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchDeleteHotelRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteHotelRoomResponseBody body;

    public static BatchDeleteHotelRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteHotelRoomResponse self = new BatchDeleteHotelRoomResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteHotelRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteHotelRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteHotelRoomResponse setBody(BatchDeleteHotelRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteHotelRoomResponseBody getBody() {
        return this.body;
    }

}
