// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityScheduleResponseBody body;

    public static GetQualityScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityScheduleResponse self = new GetQualityScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityScheduleResponse setBody(GetQualityScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityScheduleResponseBody getBody() {
        return this.body;
    }

}
