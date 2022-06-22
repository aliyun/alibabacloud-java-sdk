// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchInstallPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchInstallPluginResponseBody body;

    public static BatchInstallPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchInstallPluginResponse self = new BatchInstallPluginResponse();
        return TeaModel.build(map, self);
    }

    public BatchInstallPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchInstallPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchInstallPluginResponse setBody(BatchInstallPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchInstallPluginResponseBody getBody() {
        return this.body;
    }

}
