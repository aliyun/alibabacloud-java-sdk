// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateGroupDnsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupDnsStatusResponseBody body;

    public static UpdateGroupDnsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDnsStatusResponse self = new UpdateGroupDnsStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDnsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDnsStatusResponse setBody(UpdateGroupDnsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDnsStatusResponseBody getBody() {
        return this.body;
    }

}
