// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCallBackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AlgorithmCallBackResponseBody body;

    public static AlgorithmCallBackResponse build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCallBackResponse self = new AlgorithmCallBackResponse();
        return TeaModel.build(map, self);
    }

    public AlgorithmCallBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlgorithmCallBackResponse setBody(AlgorithmCallBackResponseBody body) {
        this.body = body;
        return this;
    }
    public AlgorithmCallBackResponseBody getBody() {
        return this.body;
    }

}
