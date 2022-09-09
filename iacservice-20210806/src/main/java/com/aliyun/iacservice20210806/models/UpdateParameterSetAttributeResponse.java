// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateParameterSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateParameterSetAttributeResponseBody body;

    public static UpdateParameterSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterSetAttributeResponse self = new UpdateParameterSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParameterSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParameterSetAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateParameterSetAttributeResponse setBody(UpdateParameterSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParameterSetAttributeResponseBody getBody() {
        return this.body;
    }

}
