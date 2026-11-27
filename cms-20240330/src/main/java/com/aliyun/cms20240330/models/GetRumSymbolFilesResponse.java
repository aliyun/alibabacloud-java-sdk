// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumSymbolFilesResponseBody body;

    public static GetRumSymbolFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFilesResponse self = new GetRumSymbolFilesResponse();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumSymbolFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumSymbolFilesResponse setBody(GetRumSymbolFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumSymbolFilesResponseBody getBody() {
        return this.body;
    }

}
