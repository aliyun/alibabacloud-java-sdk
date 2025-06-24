// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class MigrateSingleZoneToMultiZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateSingleZoneToMultiZoneResponseBody body;

    public static MigrateSingleZoneToMultiZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateSingleZoneToMultiZoneResponse self = new MigrateSingleZoneToMultiZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateSingleZoneToMultiZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateSingleZoneToMultiZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateSingleZoneToMultiZoneResponse setBody(MigrateSingleZoneToMultiZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateSingleZoneToMultiZoneResponseBody getBody() {
        return this.body;
    }

}
