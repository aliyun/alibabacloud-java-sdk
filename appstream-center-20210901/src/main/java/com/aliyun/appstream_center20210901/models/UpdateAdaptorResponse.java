// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAdaptorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdaptorResponseBody body;

    public static UpdateAdaptorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdaptorResponse self = new UpdateAdaptorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdaptorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdaptorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdaptorResponse setBody(UpdateAdaptorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdaptorResponseBody getBody() {
        return this.body;
    }

}
