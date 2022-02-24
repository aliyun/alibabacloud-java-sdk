// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCorpNodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCorpNodeInfoResponseBody body;

    public static GetCorpNodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCorpNodeInfoResponse self = new GetCorpNodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCorpNodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCorpNodeInfoResponse setBody(GetCorpNodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCorpNodeInfoResponseBody getBody() {
        return this.body;
    }

}
