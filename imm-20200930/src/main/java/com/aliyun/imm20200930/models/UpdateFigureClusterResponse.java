// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFigureClusterResponseBody body;

    public static UpdateFigureClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterResponse self = new UpdateFigureClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFigureClusterResponse setBody(UpdateFigureClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFigureClusterResponseBody getBody() {
        return this.body;
    }

}
