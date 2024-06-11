// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceGroupImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceGroupImageResponseBody body;

    public static UpdateInstanceGroupImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceGroupImageResponse self = new UpdateInstanceGroupImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceGroupImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceGroupImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceGroupImageResponse setBody(UpdateInstanceGroupImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceGroupImageResponseBody getBody() {
        return this.body;
    }

}
