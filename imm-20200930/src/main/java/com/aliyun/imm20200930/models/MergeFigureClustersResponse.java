// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MergeFigureClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MergeFigureClustersResponseBody body;

    public static MergeFigureClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeFigureClustersResponse self = new MergeFigureClustersResponse();
        return TeaModel.build(map, self);
    }

    public MergeFigureClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeFigureClustersResponse setBody(MergeFigureClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeFigureClustersResponseBody getBody() {
        return this.body;
    }

}
