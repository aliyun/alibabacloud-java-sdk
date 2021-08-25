// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRemediationTemplatesResponseBody body;

    public static ListRemediationTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationTemplatesResponse self = new ListRemediationTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRemediationTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemediationTemplatesResponse setBody(ListRemediationTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemediationTemplatesResponseBody getBody() {
        return this.body;
    }

}
