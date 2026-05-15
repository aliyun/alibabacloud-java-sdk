// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigAirflowResponseBody body;

    public static ConfigAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigAirflowResponse self = new ConfigAirflowResponse();
        return TeaModel.build(map, self);
    }

    public ConfigAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigAirflowResponse setBody(ConfigAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigAirflowResponseBody getBody() {
        return this.body;
    }

}
