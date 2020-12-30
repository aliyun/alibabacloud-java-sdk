// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterTemplateResponseBody body;

    public static CreateClusterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterTemplateResponse self = new CreateClusterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterTemplateResponse setBody(CreateClusterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterTemplateResponseBody getBody() {
        return this.body;
    }

}
