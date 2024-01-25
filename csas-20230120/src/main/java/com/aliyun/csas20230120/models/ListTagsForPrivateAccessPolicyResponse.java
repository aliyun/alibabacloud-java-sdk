// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagsForPrivateAccessPolicyResponseBody body;

    public static ListTagsForPrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessPolicyResponse self = new ListTagsForPrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsForPrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagsForPrivateAccessPolicyResponse setBody(ListTagsForPrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsForPrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
