// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class SyncThirdUserMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncThirdUserMappingResponseBody body;

    public static SyncThirdUserMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncThirdUserMappingResponse self = new SyncThirdUserMappingResponse();
        return TeaModel.build(map, self);
    }

    public SyncThirdUserMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncThirdUserMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncThirdUserMappingResponse setBody(SyncThirdUserMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncThirdUserMappingResponseBody getBody() {
        return this.body;
    }

}
