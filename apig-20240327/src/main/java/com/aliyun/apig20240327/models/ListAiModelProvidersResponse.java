// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiModelProvidersResponseBody body;

    public static ListAiModelProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelProvidersResponse self = new ListAiModelProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListAiModelProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiModelProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiModelProvidersResponse setBody(ListAiModelProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiModelProvidersResponseBody getBody() {
        return this.body;
    }

}
