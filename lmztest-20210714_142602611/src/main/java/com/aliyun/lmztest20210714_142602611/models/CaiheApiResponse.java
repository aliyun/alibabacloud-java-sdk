// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class CaiheApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CaiheApiResponseBody body;

    public static CaiheApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CaiheApiResponse self = new CaiheApiResponse();
        return TeaModel.build(map, self);
    }

    public CaiheApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CaiheApiResponse setBody(CaiheApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CaiheApiResponseBody getBody() {
        return this.body;
    }

}
