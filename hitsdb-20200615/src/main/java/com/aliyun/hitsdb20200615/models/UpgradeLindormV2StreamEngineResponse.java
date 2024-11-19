// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormV2StreamEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeLindormV2StreamEngineResponseBody body;

    public static UpgradeLindormV2StreamEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormV2StreamEngineResponse self = new UpgradeLindormV2StreamEngineResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormV2StreamEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeLindormV2StreamEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeLindormV2StreamEngineResponse setBody(UpgradeLindormV2StreamEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeLindormV2StreamEngineResponseBody getBody() {
        return this.body;
    }

}
