// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomDomainResponse self = new DeleteCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
