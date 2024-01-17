// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiResponseBody body;

    public static ModifyApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiResponse self = new ModifyApiResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiResponse setBody(ModifyApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiResponseBody getBody() {
        return this.body;
    }

}
