// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetSynchronizConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSynchronizConstantsResponseBody body;

    public static GetSynchronizConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSynchronizConstantsResponse self = new GetSynchronizConstantsResponse();
        return TeaModel.build(map, self);
    }

    public GetSynchronizConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSynchronizConstantsResponse setBody(GetSynchronizConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSynchronizConstantsResponseBody getBody() {
        return this.body;
    }

}
