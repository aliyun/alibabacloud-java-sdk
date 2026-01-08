// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetViberPauseTimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetViberPauseTimesResponseBody body;

    public static GetViberPauseTimesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetViberPauseTimesResponse self = new GetViberPauseTimesResponse();
        return TeaModel.build(map, self);
    }

    public GetViberPauseTimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetViberPauseTimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetViberPauseTimesResponse setBody(GetViberPauseTimesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetViberPauseTimesResponseBody getBody() {
        return this.body;
    }

}
