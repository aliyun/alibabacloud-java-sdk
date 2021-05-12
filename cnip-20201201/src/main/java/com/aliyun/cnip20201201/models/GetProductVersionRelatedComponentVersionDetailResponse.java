// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionRelatedComponentVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionRelatedComponentVersionDetailResponseBody body;

    public static GetProductVersionRelatedComponentVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRelatedComponentVersionDetailResponse self = new GetProductVersionRelatedComponentVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRelatedComponentVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionRelatedComponentVersionDetailResponse setBody(GetProductVersionRelatedComponentVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionRelatedComponentVersionDetailResponseBody getBody() {
        return this.body;
    }

}
