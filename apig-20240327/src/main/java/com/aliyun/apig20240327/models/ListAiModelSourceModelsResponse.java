// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelSourceModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiModelSourceModelsResponseBody body;

    public static ListAiModelSourceModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelSourceModelsResponse self = new ListAiModelSourceModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAiModelSourceModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiModelSourceModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiModelSourceModelsResponse setBody(ListAiModelSourceModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiModelSourceModelsResponseBody getBody() {
        return this.body;
    }

}
