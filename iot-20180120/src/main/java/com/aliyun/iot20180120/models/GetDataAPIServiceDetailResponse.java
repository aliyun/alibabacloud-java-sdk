// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDataAPIServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataAPIServiceDetailResponseBody body;

    public static GetDataAPIServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAPIServiceDetailResponse self = new GetDataAPIServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAPIServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAPIServiceDetailResponse setBody(GetDataAPIServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAPIServiceDetailResponseBody getBody() {
        return this.body;
    }

}
