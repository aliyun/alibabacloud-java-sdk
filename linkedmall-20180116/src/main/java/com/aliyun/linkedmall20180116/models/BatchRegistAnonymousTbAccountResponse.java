// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class BatchRegistAnonymousTbAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchRegistAnonymousTbAccountResponseBody body;

    public static BatchRegistAnonymousTbAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegistAnonymousTbAccountResponse self = new BatchRegistAnonymousTbAccountResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegistAnonymousTbAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRegistAnonymousTbAccountResponse setBody(BatchRegistAnonymousTbAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRegistAnonymousTbAccountResponseBody getBody() {
        return this.body;
    }

}
