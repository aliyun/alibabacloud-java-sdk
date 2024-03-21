// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApproveFotaUpdateResponseBody body;

    public static ApproveFotaUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveFotaUpdateResponse self = new ApproveFotaUpdateResponse();
        return TeaModel.build(map, self);
    }

    public ApproveFotaUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveFotaUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveFotaUpdateResponse setBody(ApproveFotaUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveFotaUpdateResponseBody getBody() {
        return this.body;
    }

}
