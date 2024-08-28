// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListAclPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAclPolicyResponseBody body;

    public static ListAclPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclPolicyResponse self = new ListAclPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListAclPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAclPolicyResponse setBody(ListAclPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclPolicyResponseBody getBody() {
        return this.body;
    }

}
