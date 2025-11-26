// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrometheusUserSettingResponseBody body;

    public static UpdatePrometheusUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusUserSettingResponse self = new UpdatePrometheusUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrometheusUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrometheusUserSettingResponse setBody(UpdatePrometheusUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrometheusUserSettingResponseBody getBody() {
        return this.body;
    }

}
