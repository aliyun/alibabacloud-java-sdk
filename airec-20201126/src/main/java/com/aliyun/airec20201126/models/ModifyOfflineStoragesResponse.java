// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyOfflineStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfflineStoragesResponseBody body;

    public static ModifyOfflineStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineStoragesResponse self = new ModifyOfflineStoragesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfflineStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfflineStoragesResponse setBody(ModifyOfflineStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfflineStoragesResponseBody getBody() {
        return this.body;
    }

}
