// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateCommerceSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommerceSettingResponseBody body;

    public static UpdateCommerceSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommerceSettingResponse self = new UpdateCommerceSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommerceSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommerceSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCommerceSettingResponse setBody(UpdateCommerceSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommerceSettingResponseBody getBody() {
        return this.body;
    }

}
