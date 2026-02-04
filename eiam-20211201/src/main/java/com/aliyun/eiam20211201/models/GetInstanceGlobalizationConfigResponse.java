// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceGlobalizationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceGlobalizationConfigResponseBody body;

    public static GetInstanceGlobalizationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGlobalizationConfigResponse self = new GetInstanceGlobalizationConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceGlobalizationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceGlobalizationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceGlobalizationConfigResponse setBody(GetInstanceGlobalizationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceGlobalizationConfigResponseBody getBody() {
        return this.body;
    }

}
