// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePhysicalSpaceResponseBody body;

    public static UpdatePhysicalSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceResponse self = new UpdatePhysicalSpaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhysicalSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePhysicalSpaceResponse setBody(UpdatePhysicalSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhysicalSpaceResponseBody getBody() {
        return this.body;
    }

}
