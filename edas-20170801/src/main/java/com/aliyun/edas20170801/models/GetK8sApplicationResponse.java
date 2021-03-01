// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetK8sApplicationResponseBody body;

    public static GetK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationResponse self = new GetK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetK8sApplicationResponse setBody(GetK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
