// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceMakeupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FaceMakeupResponseBody body;

    public static FaceMakeupResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceMakeupResponse self = new FaceMakeupResponse();
        return TeaModel.build(map, self);
    }

    public FaceMakeupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceMakeupResponse setBody(FaceMakeupResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceMakeupResponseBody getBody() {
        return this.body;
    }

}
