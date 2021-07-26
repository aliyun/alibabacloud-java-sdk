// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigurationSpecificationResponseBody body;

    public static DeleteConfigurationSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationSpecificationResponse self = new DeleteConfigurationSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigurationSpecificationResponse setBody(DeleteConfigurationSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigurationSpecificationResponseBody getBody() {
        return this.body;
    }

}
