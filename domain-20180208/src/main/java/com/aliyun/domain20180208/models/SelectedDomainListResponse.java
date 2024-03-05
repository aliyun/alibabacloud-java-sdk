// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class SelectedDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectedDomainListResponseBody body;

    public static SelectedDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectedDomainListResponse self = new SelectedDomainListResponse();
        return TeaModel.build(map, self);
    }

    public SelectedDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectedDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectedDomainListResponse setBody(SelectedDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectedDomainListResponseBody getBody() {
        return this.body;
    }

}
