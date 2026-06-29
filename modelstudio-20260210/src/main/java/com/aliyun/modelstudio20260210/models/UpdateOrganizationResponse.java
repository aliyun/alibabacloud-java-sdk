// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOrganizationResponseBody body;

    public static UpdateOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationResponse self = new UpdateOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrganizationResponse setBody(UpdateOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrganizationResponseBody getBody() {
        return this.body;
    }

}
