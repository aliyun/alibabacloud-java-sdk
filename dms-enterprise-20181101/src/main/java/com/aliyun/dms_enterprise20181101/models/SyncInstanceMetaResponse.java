// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncInstanceMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncInstanceMetaResponseBody body;

    public static SyncInstanceMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncInstanceMetaResponse self = new SyncInstanceMetaResponse();
        return TeaModel.build(map, self);
    }

    public SyncInstanceMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncInstanceMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncInstanceMetaResponse setBody(SyncInstanceMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncInstanceMetaResponseBody getBody() {
        return this.body;
    }

}
