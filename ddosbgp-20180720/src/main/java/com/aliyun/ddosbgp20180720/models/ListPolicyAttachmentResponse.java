// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicyAttachmentResponseBody body;

    public static ListPolicyAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentResponse self = new ListPolicyAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicyAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicyAttachmentResponse setBody(ListPolicyAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicyAttachmentResponseBody getBody() {
        return this.body;
    }

}
