// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDomainNameProxyServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForDomainNameProxyServiceResponseBody body;

    public static SaveSingleTaskForDomainNameProxyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDomainNameProxyServiceResponse self = new SaveSingleTaskForDomainNameProxyServiceResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse setBody(SaveSingleTaskForDomainNameProxyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDomainNameProxyServiceResponseBody getBody() {
        return this.body;
    }

}
