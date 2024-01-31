// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeLindormInstanceResponseBody body;

    public static UpgradeLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormInstanceResponse self = new UpgradeLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeLindormInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeLindormInstanceResponse setBody(UpgradeLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
