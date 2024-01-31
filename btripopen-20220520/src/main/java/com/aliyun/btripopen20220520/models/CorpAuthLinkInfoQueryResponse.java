// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpAuthLinkInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CorpAuthLinkInfoQueryResponseBody body;

    public static CorpAuthLinkInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CorpAuthLinkInfoQueryResponse self = new CorpAuthLinkInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public CorpAuthLinkInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CorpAuthLinkInfoQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CorpAuthLinkInfoQueryResponse setBody(CorpAuthLinkInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CorpAuthLinkInfoQueryResponseBody getBody() {
        return this.body;
    }

}
