// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class WorkitemAttachmentCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WorkitemAttachmentCreateResponseBody body;

    public static WorkitemAttachmentCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkitemAttachmentCreateResponse self = new WorkitemAttachmentCreateResponse();
        return TeaModel.build(map, self);
    }

    public WorkitemAttachmentCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkitemAttachmentCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WorkitemAttachmentCreateResponse setBody(WorkitemAttachmentCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkitemAttachmentCreateResponseBody getBody() {
        return this.body;
    }

}
