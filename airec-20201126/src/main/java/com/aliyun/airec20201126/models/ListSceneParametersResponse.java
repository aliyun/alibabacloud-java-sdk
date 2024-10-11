// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSceneParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSceneParametersResponseBody body;

    public static ListSceneParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSceneParametersResponse self = new ListSceneParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListSceneParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSceneParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSceneParametersResponse setBody(ListSceneParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSceneParametersResponseBody getBody() {
        return this.body;
    }

}
