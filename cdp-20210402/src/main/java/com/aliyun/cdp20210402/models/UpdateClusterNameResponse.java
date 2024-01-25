// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class UpdateClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterNameResponseBody body;

    public static UpdateClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNameResponse self = new UpdateClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterNameResponse setBody(UpdateClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterNameResponseBody getBody() {
        return this.body;
    }

}
