// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPrefixListResponseBody body;

    public static ModifyPrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListResponse self = new ModifyPrefixListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrefixListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrefixListResponse setBody(ModifyPrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrefixListResponseBody getBody() {
        return this.body;
    }

}
