// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20210928.models;

import com.aliyun.tea.*;

public class GridQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GridQueryResponse setBody(GridQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GridQueryResponseBody getBody() {
        return this.body;
    }

}
