// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifySiteFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySiteFeaturesResponseBody body;

    public static ModifySiteFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteFeaturesResponse self = new ModifySiteFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ModifySiteFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySiteFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySiteFeaturesResponse setBody(ModifySiteFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySiteFeaturesResponseBody getBody() {
        return this.body;
    }

}
