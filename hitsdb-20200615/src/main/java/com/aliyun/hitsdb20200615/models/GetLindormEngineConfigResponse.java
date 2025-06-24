// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormEngineConfigResponseBody body;

    public static GetLindormEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormEngineConfigResponse self = new GetLindormEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormEngineConfigResponse setBody(GetLindormEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormEngineConfigResponseBody getBody() {
        return this.body;
    }

}
