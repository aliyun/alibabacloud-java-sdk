// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyGroupAuthAppCodeForBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGroupAuthAppCodeForBackendResponseBody body;

    public static ModifyGroupAuthAppCodeForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupAuthAppCodeForBackendResponse self = new ModifyGroupAuthAppCodeForBackendResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGroupAuthAppCodeForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGroupAuthAppCodeForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGroupAuthAppCodeForBackendResponse setBody(ModifyGroupAuthAppCodeForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGroupAuthAppCodeForBackendResponseBody getBody() {
        return this.body;
    }

}
