// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowForWebResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowForWebResponseBody body;

    public static CreateFlowForWebResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowForWebResponse self = new CreateFlowForWebResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowForWebResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowForWebResponse setBody(CreateFlowForWebResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowForWebResponseBody getBody() {
        return this.body;
    }

}
