// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacUserCertStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacUserCertStatusResponseBody body;

    public static UpdateNacUserCertStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacUserCertStatusResponse self = new UpdateNacUserCertStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacUserCertStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacUserCertStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacUserCertStatusResponse setBody(UpdateNacUserCertStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacUserCertStatusResponseBody getBody() {
        return this.body;
    }

}
