// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateMetaTablePreviewTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMetaTablePreviewTaskResponseBody body;

    public static CreateMetaTablePreviewTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaTablePreviewTaskResponse self = new CreateMetaTablePreviewTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetaTablePreviewTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetaTablePreviewTaskResponse setBody(CreateMetaTablePreviewTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetaTablePreviewTaskResponseBody getBody() {
        return this.body;
    }

}
