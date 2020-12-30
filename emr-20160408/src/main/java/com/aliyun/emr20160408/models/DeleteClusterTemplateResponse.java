// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteClusterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterTemplateResponseBody body;

    public static DeleteClusterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterTemplateResponse self = new DeleteClusterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterTemplateResponse setBody(DeleteClusterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterTemplateResponseBody getBody() {
        return this.body;
    }

}
