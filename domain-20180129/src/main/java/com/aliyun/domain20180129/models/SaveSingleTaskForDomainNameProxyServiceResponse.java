// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDomainNameProxyServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForDomainNameProxyServiceResponse setBody(SaveSingleTaskForDomainNameProxyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDomainNameProxyServiceResponseBody getBody() {
        return this.body;
    }

}
