// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestPersonnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMergeRequestPersonnelResponseBody body;

    public static UpdateMergeRequestPersonnelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestPersonnelResponse self = new UpdateMergeRequestPersonnelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestPersonnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMergeRequestPersonnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMergeRequestPersonnelResponse setBody(UpdateMergeRequestPersonnelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMergeRequestPersonnelResponseBody getBody() {
        return this.body;
    }

}
