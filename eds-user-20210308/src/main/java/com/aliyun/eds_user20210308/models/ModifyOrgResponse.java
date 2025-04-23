// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOrgResponseBody body;

    public static ModifyOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrgResponse self = new ModifyOrgResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOrgResponse setBody(ModifyOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOrgResponseBody getBody() {
        return this.body;
    }

}
