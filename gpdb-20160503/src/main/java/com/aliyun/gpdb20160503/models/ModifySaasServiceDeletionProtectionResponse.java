// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySaasServiceDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySaasServiceDeletionProtectionResponseBody body;

    public static ModifySaasServiceDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySaasServiceDeletionProtectionResponse self = new ModifySaasServiceDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySaasServiceDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySaasServiceDeletionProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySaasServiceDeletionProtectionResponse setBody(ModifySaasServiceDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySaasServiceDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
