// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomUserStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveRoomUserStatisticsResponseBody body;

    public static GetLiveRoomUserStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomUserStatisticsResponse self = new GetLiveRoomUserStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomUserStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRoomUserStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRoomUserStatisticsResponse setBody(GetLiveRoomUserStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRoomUserStatisticsResponseBody getBody() {
        return this.body;
    }

}
