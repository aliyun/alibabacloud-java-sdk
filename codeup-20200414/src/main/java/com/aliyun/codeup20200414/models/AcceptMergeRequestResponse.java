// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AcceptMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AcceptMergeRequestResponseBody body;

    public static AcceptMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptMergeRequestResponse self = new AcceptMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public AcceptMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptMergeRequestResponse setBody(AcceptMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptMergeRequestResponseBody getBody() {
        return this.body;
    }

}
