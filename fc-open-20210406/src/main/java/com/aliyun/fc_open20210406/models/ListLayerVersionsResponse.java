// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayerVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLayerVersionsResponseBody body;

    public static ListLayerVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLayerVersionsResponse self = new ListLayerVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListLayerVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLayerVersionsResponse setBody(ListLayerVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLayerVersionsResponseBody getBody() {
        return this.body;
    }

}
