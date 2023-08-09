// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSyntheticMonitorsResponseBody body;

    public static GetSyntheticMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticMonitorsResponse self = new GetSyntheticMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public GetSyntheticMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSyntheticMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSyntheticMonitorsResponse setBody(GetSyntheticMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSyntheticMonitorsResponseBody getBody() {
        return this.body;
    }

}
