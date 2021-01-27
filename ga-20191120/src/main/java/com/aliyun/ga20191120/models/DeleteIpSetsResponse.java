// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpSetsResponseBody body;

    public static DeleteIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetsResponse self = new DeleteIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpSetsResponse setBody(DeleteIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpSetsResponseBody getBody() {
        return this.body;
    }

}
