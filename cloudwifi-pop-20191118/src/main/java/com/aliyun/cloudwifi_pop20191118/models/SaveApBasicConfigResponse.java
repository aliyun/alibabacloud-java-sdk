// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApBasicConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveApBasicConfigResponse setBody(SaveApBasicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApBasicConfigResponseBody getBody() {
        return this.body;
    }

}
