// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataServiceApiAuthorityResponseBody body;

    public static DeleteDataServiceApiAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceApiAuthorityResponse self = new DeleteDataServiceApiAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceApiAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataServiceApiAuthorityResponse setBody(DeleteDataServiceApiAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataServiceApiAuthorityResponseBody getBody() {
        return this.body;
    }

}
