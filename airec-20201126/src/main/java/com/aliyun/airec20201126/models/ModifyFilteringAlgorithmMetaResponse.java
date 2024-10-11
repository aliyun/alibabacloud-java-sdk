// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFilteringAlgorithmMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFilteringAlgorithmMetaResponseBody body;

    public static ModifyFilteringAlgorithmMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFilteringAlgorithmMetaResponse self = new ModifyFilteringAlgorithmMetaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFilteringAlgorithmMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFilteringAlgorithmMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFilteringAlgorithmMetaResponse setBody(ModifyFilteringAlgorithmMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFilteringAlgorithmMetaResponseBody getBody() {
        return this.body;
    }

}
