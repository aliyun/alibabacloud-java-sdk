// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListLayerVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLayerVersionOutput body;

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

    public ListLayerVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLayerVersionsResponse setBody(ListLayerVersionOutput body) {
        this.body = body;
        return this;
    }
    public ListLayerVersionOutput getBody() {
        return this.body;
    }

}
