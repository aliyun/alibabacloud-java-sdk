// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetRoomStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoomStatisticsResponseBody body;

    public static GetRoomStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoomStatisticsResponse self = new GetRoomStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRoomStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoomStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoomStatisticsResponse setBody(GetRoomStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoomStatisticsResponseBody getBody() {
        return this.body;
    }

}
