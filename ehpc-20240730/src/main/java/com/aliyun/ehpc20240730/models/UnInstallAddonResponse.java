// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UnInstallAddonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnInstallAddonResponseBody body;

    public static UnInstallAddonResponse build(java.util.Map<String, ?> map) throws Exception {
        UnInstallAddonResponse self = new UnInstallAddonResponse();
        return TeaModel.build(map, self);
    }

    public UnInstallAddonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnInstallAddonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnInstallAddonResponse setBody(UnInstallAddonResponseBody body) {
        this.body = body;
        return this;
    }
    public UnInstallAddonResponseBody getBody() {
        return this.body;
    }

}
