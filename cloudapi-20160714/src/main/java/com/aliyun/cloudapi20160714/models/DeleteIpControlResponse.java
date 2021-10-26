// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteIpControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpControlResponseBody body;

    public static DeleteIpControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpControlResponse self = new DeleteIpControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpControlResponse setBody(DeleteIpControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpControlResponseBody getBody() {
        return this.body;
    }

}
