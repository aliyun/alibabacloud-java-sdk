// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class BatchAddHotelRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddHotelRoomResponseBody body;

    public static BatchAddHotelRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddHotelRoomResponse self = new BatchAddHotelRoomResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddHotelRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddHotelRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddHotelRoomResponse setBody(BatchAddHotelRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddHotelRoomResponseBody getBody() {
        return this.body;
    }

}
