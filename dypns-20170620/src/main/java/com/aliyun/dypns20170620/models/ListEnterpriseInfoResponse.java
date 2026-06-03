// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseInfoResponseBody body;

    public static ListEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseInfoResponse self = new ListEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseInfoResponse setBody(ListEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
