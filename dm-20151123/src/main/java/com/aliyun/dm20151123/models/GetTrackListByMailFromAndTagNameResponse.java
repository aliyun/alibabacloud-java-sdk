// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListByMailFromAndTagNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrackListByMailFromAndTagNameResponseBody body;

    public static GetTrackListByMailFromAndTagNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListByMailFromAndTagNameResponse self = new GetTrackListByMailFromAndTagNameResponse();
        return TeaModel.build(map, self);
    }

    public GetTrackListByMailFromAndTagNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrackListByMailFromAndTagNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrackListByMailFromAndTagNameResponse setBody(GetTrackListByMailFromAndTagNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrackListByMailFromAndTagNameResponseBody getBody() {
        return this.body;
    }

}
