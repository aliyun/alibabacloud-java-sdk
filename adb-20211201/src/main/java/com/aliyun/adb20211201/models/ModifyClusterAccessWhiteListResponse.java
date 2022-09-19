// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterAccessWhiteListResponseBody body;

    public static ModifyClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAccessWhiteListResponse self = new ModifyClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterAccessWhiteListResponse setBody(ModifyClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
