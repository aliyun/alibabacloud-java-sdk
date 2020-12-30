// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterWithTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterWithTemplateResponseBody body;

    public static CreateClusterWithTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterWithTemplateResponse self = new CreateClusterWithTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterWithTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterWithTemplateResponse setBody(CreateClusterWithTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterWithTemplateResponseBody getBody() {
        return this.body;
    }

}
