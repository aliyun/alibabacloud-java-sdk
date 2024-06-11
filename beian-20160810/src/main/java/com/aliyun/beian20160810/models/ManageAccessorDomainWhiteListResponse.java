// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorDomainWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageAccessorDomainWhiteListResponseBody body;

    public static ManageAccessorDomainWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorDomainWhiteListResponse self = new ManageAccessorDomainWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ManageAccessorDomainWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageAccessorDomainWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageAccessorDomainWhiteListResponse setBody(ManageAccessorDomainWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageAccessorDomainWhiteListResponseBody getBody() {
        return this.body;
    }

}
