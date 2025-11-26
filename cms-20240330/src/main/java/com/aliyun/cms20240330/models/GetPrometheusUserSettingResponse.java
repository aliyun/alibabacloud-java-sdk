// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrometheusUserSettingResponseBody body;

    public static GetPrometheusUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusUserSettingResponse self = new GetPrometheusUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetPrometheusUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrometheusUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrometheusUserSettingResponse setBody(GetPrometheusUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrometheusUserSettingResponseBody getBody() {
        return this.body;
    }

}
