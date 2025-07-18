// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyStudioLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStudioLayoutResponseBody body;

    public static ModifyStudioLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStudioLayoutResponse self = new ModifyStudioLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStudioLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStudioLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStudioLayoutResponse setBody(ModifyStudioLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStudioLayoutResponseBody getBody() {
        return this.body;
    }

}
