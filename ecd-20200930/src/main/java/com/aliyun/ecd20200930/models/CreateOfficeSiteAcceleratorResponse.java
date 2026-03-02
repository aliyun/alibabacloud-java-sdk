// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeSiteAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOfficeSiteAcceleratorResponseBody body;

    public static CreateOfficeSiteAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeSiteAcceleratorResponse self = new CreateOfficeSiteAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public CreateOfficeSiteAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOfficeSiteAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOfficeSiteAcceleratorResponse setBody(CreateOfficeSiteAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOfficeSiteAcceleratorResponseBody getBody() {
        return this.body;
    }

}
