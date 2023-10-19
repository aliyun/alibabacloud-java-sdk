// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCommerceSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCommerceSettingResponseBody body;

    public static GetCommerceSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommerceSettingResponse self = new GetCommerceSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetCommerceSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommerceSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommerceSettingResponse setBody(GetCommerceSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommerceSettingResponseBody getBody() {
        return this.body;
    }

}
