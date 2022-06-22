// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StartPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartPluginResponseBody body;

    public static StartPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPluginResponse self = new StartPluginResponse();
        return TeaModel.build(map, self);
    }

    public StartPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPluginResponse setBody(StartPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPluginResponseBody getBody() {
        return this.body;
    }

}
