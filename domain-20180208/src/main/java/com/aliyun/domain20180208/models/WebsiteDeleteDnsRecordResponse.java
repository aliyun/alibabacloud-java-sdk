// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class WebsiteDeleteDnsRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebsiteDeleteDnsRecordResponseBody body;

    public static WebsiteDeleteDnsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        WebsiteDeleteDnsRecordResponse self = new WebsiteDeleteDnsRecordResponse();
        return TeaModel.build(map, self);
    }

    public WebsiteDeleteDnsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebsiteDeleteDnsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebsiteDeleteDnsRecordResponse setBody(WebsiteDeleteDnsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public WebsiteDeleteDnsRecordResponseBody getBody() {
        return this.body;
    }

}
