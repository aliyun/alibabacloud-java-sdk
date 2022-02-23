// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ChangePreferredLanguageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangePreferredLanguageResponseBody body;

    public static ChangePreferredLanguageResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangePreferredLanguageResponse self = new ChangePreferredLanguageResponse();
        return TeaModel.build(map, self);
    }

    public ChangePreferredLanguageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangePreferredLanguageResponse setBody(ChangePreferredLanguageResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangePreferredLanguageResponseBody getBody() {
        return this.body;
    }

}
