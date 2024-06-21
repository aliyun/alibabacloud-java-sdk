// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumAppsResponseBody body;

    public static GetRumAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumAppsResponse self = new GetRumAppsResponse();
        return TeaModel.build(map, self);
    }

    public GetRumAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumAppsResponse setBody(GetRumAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumAppsResponseBody getBody() {
        return this.body;
    }

}
