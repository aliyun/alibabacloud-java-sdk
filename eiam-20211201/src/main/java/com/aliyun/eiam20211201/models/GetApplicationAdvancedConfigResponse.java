// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationAdvancedConfigResponseBody body;

    public static GetApplicationAdvancedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationAdvancedConfigResponse self = new GetApplicationAdvancedConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationAdvancedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationAdvancedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationAdvancedConfigResponse setBody(GetApplicationAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
