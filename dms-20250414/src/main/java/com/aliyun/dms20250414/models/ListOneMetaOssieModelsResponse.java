// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListOneMetaOssieModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOneMetaOssieModelsResponseBody body;

    public static ListOneMetaOssieModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOneMetaOssieModelsResponse self = new ListOneMetaOssieModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListOneMetaOssieModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOneMetaOssieModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOneMetaOssieModelsResponse setBody(ListOneMetaOssieModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOneMetaOssieModelsResponseBody getBody() {
        return this.body;
    }

}
