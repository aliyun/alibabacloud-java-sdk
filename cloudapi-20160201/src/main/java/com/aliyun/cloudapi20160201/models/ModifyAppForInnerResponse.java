// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyAppForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppForInnerResponseBody body;

    public static ModifyAppForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppForInnerResponse self = new ModifyAppForInnerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppForInnerResponse setBody(ModifyAppForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppForInnerResponseBody getBody() {
        return this.body;
    }

}
