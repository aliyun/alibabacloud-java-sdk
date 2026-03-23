// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApBasicConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveApBasicConfigResponseBody body;

    public static SaveApBasicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApBasicConfigResponse self = new SaveApBasicConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApBasicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApBasicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveApBasicConfigResponse setBody(SaveApBasicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApBasicConfigResponseBody getBody() {
        return this.body;
    }

}
