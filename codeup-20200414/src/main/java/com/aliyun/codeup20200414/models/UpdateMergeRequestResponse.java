// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
