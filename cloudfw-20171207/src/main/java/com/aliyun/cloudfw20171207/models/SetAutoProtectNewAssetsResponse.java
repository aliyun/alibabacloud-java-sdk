// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SetAutoProtectNewAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAutoProtectNewAssetsResponseBody body;

    public static SetAutoProtectNewAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAutoProtectNewAssetsResponse self = new SetAutoProtectNewAssetsResponse();
        return TeaModel.build(map, self);
    }

    public SetAutoProtectNewAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAutoProtectNewAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAutoProtectNewAssetsResponse setBody(SetAutoProtectNewAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAutoProtectNewAssetsResponseBody getBody() {
        return this.body;
    }

}
