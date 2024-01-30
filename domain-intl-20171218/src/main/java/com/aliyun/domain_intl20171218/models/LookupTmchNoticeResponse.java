// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class LookupTmchNoticeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public LookupTmchNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LookupTmchNoticeResponse setBody(LookupTmchNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupTmchNoticeResponseBody getBody() {
        return this.body;
    }

}
