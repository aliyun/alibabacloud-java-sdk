// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCustomFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCustomFieldResponseBody body;

    public static DisableCustomFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomFieldResponse self = new DisableCustomFieldResponse();
        return TeaModel.build(map, self);
    }

    public DisableCustomFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCustomFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCustomFieldResponse setBody(DisableCustomFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCustomFieldResponseBody getBody() {
        return this.body;
    }

}
