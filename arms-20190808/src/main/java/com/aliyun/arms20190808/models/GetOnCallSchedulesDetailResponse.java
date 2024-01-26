// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetOnCallSchedulesDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnCallSchedulesDetailResponseBody body;

    public static GetOnCallSchedulesDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnCallSchedulesDetailResponse self = new GetOnCallSchedulesDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOnCallSchedulesDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnCallSchedulesDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnCallSchedulesDetailResponse setBody(GetOnCallSchedulesDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnCallSchedulesDetailResponseBody getBody() {
        return this.body;
    }

}
