// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfficeSiteAcceleratorResponseBody body;

    public static ModifyOfficeSiteAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAcceleratorResponse self = new ModifyOfficeSiteAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfficeSiteAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfficeSiteAcceleratorResponse setBody(ModifyOfficeSiteAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteAcceleratorResponseBody getBody() {
        return this.body;
    }

}
