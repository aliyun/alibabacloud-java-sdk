// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetUserByAliyunUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserByAliyunUidResponseBody body;

    public static GetUserByAliyunUidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAliyunUidResponse self = new GetUserByAliyunUidResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByAliyunUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByAliyunUidResponse setBody(GetUserByAliyunUidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByAliyunUidResponseBody getBody() {
        return this.body;
    }

}
