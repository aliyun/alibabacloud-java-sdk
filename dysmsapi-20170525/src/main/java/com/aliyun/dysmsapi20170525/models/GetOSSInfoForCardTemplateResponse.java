// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForCardTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOSSInfoForCardTemplateResponseBody body;

    public static GetOSSInfoForCardTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSInfoForCardTemplateResponse self = new GetOSSInfoForCardTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSInfoForCardTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSInfoForCardTemplateResponse setBody(GetOSSInfoForCardTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOSSInfoForCardTemplateResponseBody getBody() {
        return this.body;
    }

}
