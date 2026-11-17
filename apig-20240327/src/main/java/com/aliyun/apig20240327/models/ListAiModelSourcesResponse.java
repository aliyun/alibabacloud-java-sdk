// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiModelSourcesResponseBody body;

    public static ListAiModelSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelSourcesResponse self = new ListAiModelSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAiModelSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiModelSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiModelSourcesResponse setBody(ListAiModelSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiModelSourcesResponseBody getBody() {
        return this.body;
    }

}
