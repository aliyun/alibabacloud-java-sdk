// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveRoomStatisticsResponseBody body;

    public static GetLiveRoomStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomStatisticsResponse self = new GetLiveRoomStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRoomStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRoomStatisticsResponse setBody(GetLiveRoomStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRoomStatisticsResponseBody getBody() {
        return this.body;
    }

}
