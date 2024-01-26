// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyADConnectorOfficeSiteResponseBody body;

    public static ModifyADConnectorOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorOfficeSiteResponse self = new ModifyADConnectorOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorOfficeSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyADConnectorOfficeSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyADConnectorOfficeSiteResponse setBody(ModifyADConnectorOfficeSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyADConnectorOfficeSiteResponseBody getBody() {
        return this.body;
    }

}
