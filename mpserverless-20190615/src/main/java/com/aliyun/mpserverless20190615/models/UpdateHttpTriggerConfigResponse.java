// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateHttpTriggerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpTriggerConfigResponseBody body;

    public static UpdateHttpTriggerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpTriggerConfigResponse self = new UpdateHttpTriggerConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpTriggerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpTriggerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpTriggerConfigResponse setBody(UpdateHttpTriggerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpTriggerConfigResponseBody getBody() {
        return this.body;
    }

}
