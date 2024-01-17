// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiForInnerResponseBody body;

    public static ModifyApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiForInnerResponse self = new ModifyApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiForInnerResponse setBody(ModifyApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiForInnerResponseBody getBody() {
        return this.body;
    }

}
