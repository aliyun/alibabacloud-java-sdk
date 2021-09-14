// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenDatasourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScreenDatasourceConfigResponseBody body;

    public static GetScreenDatasourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScreenDatasourceConfigResponse self = new GetScreenDatasourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetScreenDatasourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScreenDatasourceConfigResponse setBody(GetScreenDatasourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScreenDatasourceConfigResponseBody getBody() {
        return this.body;
    }

}
