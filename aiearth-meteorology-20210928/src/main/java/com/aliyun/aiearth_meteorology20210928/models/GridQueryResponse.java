// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20210928.models;

import com.aliyun.tea.*;

public class GridQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GridQueryResponseBody body;

    public static GridQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GridQueryResponse self = new GridQueryResponse();
        return TeaModel.build(map, self);
    }

    public GridQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GridQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GridQueryResponse setBody(GridQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GridQueryResponseBody getBody() {
        return this.body;
    }

}
