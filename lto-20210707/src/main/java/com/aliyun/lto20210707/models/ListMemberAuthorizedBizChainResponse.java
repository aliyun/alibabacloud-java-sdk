// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAuthorizedBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMemberAuthorizedBizChainResponseBody body;

    public static ListMemberAuthorizedBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAuthorizedBizChainResponse self = new ListMemberAuthorizedBizChainResponse();
        return TeaModel.build(map, self);
    }

    public ListMemberAuthorizedBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemberAuthorizedBizChainResponse setBody(ListMemberAuthorizedBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemberAuthorizedBizChainResponseBody getBody() {
        return this.body;
    }

}
