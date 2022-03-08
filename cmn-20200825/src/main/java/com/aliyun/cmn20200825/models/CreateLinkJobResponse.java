// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateLinkJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkJobResponseBody body;

    public static CreateLinkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkJobResponse self = new CreateLinkJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkJobResponse setBody(CreateLinkJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkJobResponseBody getBody() {
        return this.body;
    }

}
