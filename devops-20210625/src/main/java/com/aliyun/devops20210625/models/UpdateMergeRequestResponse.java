// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMergeRequestResponseBody body;

    public static UpdateMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestResponse self = new UpdateMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMergeRequestResponse setBody(UpdateMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMergeRequestResponseBody getBody() {
        return this.body;
    }

}
