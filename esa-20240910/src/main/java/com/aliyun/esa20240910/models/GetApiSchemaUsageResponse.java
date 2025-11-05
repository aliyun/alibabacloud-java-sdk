// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetApiSchemaUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiSchemaUsageResponseBody body;

    public static GetApiSchemaUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiSchemaUsageResponse self = new GetApiSchemaUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetApiSchemaUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiSchemaUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiSchemaUsageResponse setBody(GetApiSchemaUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiSchemaUsageResponseBody getBody() {
        return this.body;
    }

}
