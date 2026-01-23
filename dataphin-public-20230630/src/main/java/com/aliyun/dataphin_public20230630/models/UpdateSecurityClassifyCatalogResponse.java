// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityClassifyCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityClassifyCatalogResponseBody body;

    public static UpdateSecurityClassifyCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityClassifyCatalogResponse self = new UpdateSecurityClassifyCatalogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityClassifyCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityClassifyCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityClassifyCatalogResponse setBody(UpdateSecurityClassifyCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityClassifyCatalogResponseBody getBody() {
        return this.body;
    }

}
