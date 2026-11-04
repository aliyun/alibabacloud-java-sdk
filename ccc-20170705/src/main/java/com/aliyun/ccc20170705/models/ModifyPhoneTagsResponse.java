// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPhoneTagsResponseBody body;

    public static ModifyPhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneTagsResponse self = new ModifyPhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhoneTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPhoneTagsResponse setBody(ModifyPhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhoneTagsResponseBody getBody() {
        return this.body;
    }

}
