// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAppInstanceGroupImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppInstanceGroupImageResponseBody body;

    public static UpdateAppInstanceGroupImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInstanceGroupImageResponse self = new UpdateAppInstanceGroupImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppInstanceGroupImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppInstanceGroupImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppInstanceGroupImageResponse setBody(UpdateAppInstanceGroupImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppInstanceGroupImageResponseBody getBody() {
        return this.body;
    }

}
