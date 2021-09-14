// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemplateByScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTemplateByScreenResponseBody body;

    public static CreateTemplateByScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateByScreenResponse self = new CreateTemplateByScreenResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateByScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateByScreenResponse setBody(CreateTemplateByScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateByScreenResponseBody getBody() {
        return this.body;
    }

}
