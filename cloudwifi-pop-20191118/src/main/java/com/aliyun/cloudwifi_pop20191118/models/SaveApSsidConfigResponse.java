// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApSsidConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveApSsidConfigResponseBody body;

    public static SaveApSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveApSsidConfigResponse self = new SaveApSsidConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveApSsidConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveApSsidConfigResponse setBody(SaveApSsidConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveApSsidConfigResponseBody getBody() {
        return this.body;
    }

}
