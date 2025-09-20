// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAvailableParserTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvailableParserTypesResponseBody body;

    public static GetAvailableParserTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableParserTypesResponse self = new GetAvailableParserTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailableParserTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailableParserTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvailableParserTypesResponse setBody(GetAvailableParserTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailableParserTypesResponseBody getBody() {
        return this.body;
    }

}
