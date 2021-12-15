// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IncreaseListResponseBody body;

    public static IncreaseListResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseListResponse self = new IncreaseListResponse();
        return TeaModel.build(map, self);
    }

    public IncreaseListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncreaseListResponse setBody(IncreaseListResponseBody body) {
        this.body = body;
        return this;
    }
    public IncreaseListResponseBody getBody() {
        return this.body;
    }

}
