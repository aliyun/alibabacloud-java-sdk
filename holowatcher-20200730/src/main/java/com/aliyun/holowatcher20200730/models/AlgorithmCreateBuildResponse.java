// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCreateBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AlgorithmCreateBuildResponseBody body;

    public static AlgorithmCreateBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCreateBuildResponse self = new AlgorithmCreateBuildResponse();
        return TeaModel.build(map, self);
    }

    public AlgorithmCreateBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlgorithmCreateBuildResponse setBody(AlgorithmCreateBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public AlgorithmCreateBuildResponseBody getBody() {
        return this.body;
    }

}
