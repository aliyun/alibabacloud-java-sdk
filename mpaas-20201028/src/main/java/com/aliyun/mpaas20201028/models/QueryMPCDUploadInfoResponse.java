// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMPCDUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMPCDUploadInfoResponseBody body;

    public static QueryMPCDUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMPCDUploadInfoResponse self = new QueryMPCDUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMPCDUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMPCDUploadInfoResponse setBody(QueryMPCDUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMPCDUploadInfoResponseBody getBody() {
        return this.body;
    }

}
