// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualitySchedulesByWatchIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualitySchedulesByWatchIdResponseBody body;

    public static GetQualitySchedulesByWatchIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualitySchedulesByWatchIdResponse self = new GetQualitySchedulesByWatchIdResponse();
        return TeaModel.build(map, self);
    }

    public GetQualitySchedulesByWatchIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualitySchedulesByWatchIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualitySchedulesByWatchIdResponse setBody(GetQualitySchedulesByWatchIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualitySchedulesByWatchIdResponseBody getBody() {
        return this.body;
    }

}
