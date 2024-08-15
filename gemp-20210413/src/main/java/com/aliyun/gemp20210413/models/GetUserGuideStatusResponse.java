// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserGuideStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserGuideStatusResponseBody body;

    public static GetUserGuideStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGuideStatusResponse self = new GetUserGuideStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGuideStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGuideStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserGuideStatusResponse setBody(GetUserGuideStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGuideStatusResponseBody getBody() {
        return this.body;
    }

}
