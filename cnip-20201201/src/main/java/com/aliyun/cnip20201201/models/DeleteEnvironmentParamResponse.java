// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnvironmentParamResponseBody body;

    public static DeleteEnvironmentParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentParamResponse self = new DeleteEnvironmentParamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentParamResponse setBody(DeleteEnvironmentParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentParamResponseBody getBody() {
        return this.body;
    }

}
