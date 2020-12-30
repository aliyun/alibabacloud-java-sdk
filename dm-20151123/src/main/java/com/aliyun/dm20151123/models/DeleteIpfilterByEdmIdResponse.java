// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteIpfilterByEdmIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpfilterByEdmIdResponseBody body;

    public static DeleteIpfilterByEdmIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpfilterByEdmIdResponse self = new DeleteIpfilterByEdmIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpfilterByEdmIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpfilterByEdmIdResponse setBody(DeleteIpfilterByEdmIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpfilterByEdmIdResponseBody getBody() {
        return this.body;
    }

}
