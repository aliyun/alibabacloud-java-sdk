// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMultiPartyCollaborationChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultiPartyCollaborationChainResponseBody body;

    public static ListMultiPartyCollaborationChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiPartyCollaborationChainResponse self = new ListMultiPartyCollaborationChainResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiPartyCollaborationChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiPartyCollaborationChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiPartyCollaborationChainResponse setBody(ListMultiPartyCollaborationChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiPartyCollaborationChainResponseBody getBody() {
        return this.body;
    }

}
