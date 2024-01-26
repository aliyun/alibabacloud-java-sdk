// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfficeSiteAttributeResponseBody body;

    public static ModifyOfficeSiteAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAttributeResponse self = new ModifyOfficeSiteAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfficeSiteAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfficeSiteAttributeResponse setBody(ModifyOfficeSiteAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteAttributeResponseBody getBody() {
        return this.body;
    }

}
