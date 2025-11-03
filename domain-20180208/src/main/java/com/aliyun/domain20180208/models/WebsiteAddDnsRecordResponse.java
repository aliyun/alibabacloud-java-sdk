// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class WebsiteAddDnsRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebsiteAddDnsRecordResponseBody body;

    public static WebsiteAddDnsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        WebsiteAddDnsRecordResponse self = new WebsiteAddDnsRecordResponse();
        return TeaModel.build(map, self);
    }

    public WebsiteAddDnsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebsiteAddDnsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebsiteAddDnsRecordResponse setBody(WebsiteAddDnsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public WebsiteAddDnsRecordResponseBody getBody() {
        return this.body;
    }

}
