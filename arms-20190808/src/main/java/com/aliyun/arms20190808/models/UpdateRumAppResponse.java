// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRumAppResponseBody body;

    public static UpdateRumAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumAppResponse self = new UpdateRumAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRumAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRumAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRumAppResponse setBody(UpdateRumAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRumAppResponseBody getBody() {
        return this.body;
    }

}
