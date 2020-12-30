// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class LookupTmchNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LookupTmchNoticeResponseBody body;

    public static LookupTmchNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupTmchNoticeResponse self = new LookupTmchNoticeResponse();
        return TeaModel.build(map, self);
    }

    public LookupTmchNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupTmchNoticeResponse setBody(LookupTmchNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupTmchNoticeResponseBody getBody() {
        return this.body;
    }

}
