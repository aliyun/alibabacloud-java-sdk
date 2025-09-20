// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetParseSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParseSettingsResponseBody body;

    public static GetParseSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParseSettingsResponse self = new GetParseSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetParseSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParseSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParseSettingsResponse setBody(GetParseSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParseSettingsResponseBody getBody() {
        return this.body;
    }

}
