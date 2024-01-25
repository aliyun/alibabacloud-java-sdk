// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForDomainNameProxyServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForDomainNameProxyServiceResponseBody body;

    public static SaveBatchTaskForDomainNameProxyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForDomainNameProxyServiceResponse self = new SaveBatchTaskForDomainNameProxyServiceResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse setBody(SaveBatchTaskForDomainNameProxyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForDomainNameProxyServiceResponseBody getBody() {
        return this.body;
    }

}
