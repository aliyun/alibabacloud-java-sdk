// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RecoverClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverClusterResponseBody body;

    public static RecoverClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverClusterResponse self = new RecoverClusterResponse();
        return TeaModel.build(map, self);
    }

    public RecoverClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverClusterResponse setBody(RecoverClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverClusterResponseBody getBody() {
        return this.body;
    }

}
