// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateEnumMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnumMappingResponseBody body;

    public static UpdateEnumMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnumMappingResponse self = new UpdateEnumMappingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnumMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnumMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnumMappingResponse setBody(UpdateEnumMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnumMappingResponseBody getBody() {
        return this.body;
    }

}
