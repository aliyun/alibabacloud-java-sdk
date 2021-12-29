// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBlockchainMetadataResponseBody body;

    public static QueryBlockchainMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainMetadataResponse self = new QueryBlockchainMetadataResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlockchainMetadataResponse setBody(QueryBlockchainMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlockchainMetadataResponseBody getBody() {
        return this.body;
    }

}
