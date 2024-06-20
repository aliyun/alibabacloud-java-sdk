// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class LookupWmInfoMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LookupWmInfoMappingResponseBody body;

    public static LookupWmInfoMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupWmInfoMappingResponse self = new LookupWmInfoMappingResponse();
        return TeaModel.build(map, self);
    }

    public LookupWmInfoMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupWmInfoMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LookupWmInfoMappingResponse setBody(LookupWmInfoMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupWmInfoMappingResponseBody getBody() {
        return this.body;
    }

}
