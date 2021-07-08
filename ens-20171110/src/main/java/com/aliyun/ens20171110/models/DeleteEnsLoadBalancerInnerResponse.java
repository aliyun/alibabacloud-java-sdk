// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsLoadBalancerInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnsLoadBalancerInnerResponseBody body;

    public static DeleteEnsLoadBalancerInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsLoadBalancerInnerResponse self = new DeleteEnsLoadBalancerInnerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnsLoadBalancerInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnsLoadBalancerInnerResponse setBody(DeleteEnsLoadBalancerInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnsLoadBalancerInnerResponseBody getBody() {
        return this.body;
    }

}
