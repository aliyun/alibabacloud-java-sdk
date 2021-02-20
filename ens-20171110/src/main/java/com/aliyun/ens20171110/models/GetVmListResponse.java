// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetVmListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVmListResponseBody body;

    public static GetVmListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmListResponse self = new GetVmListResponse();
        return TeaModel.build(map, self);
    }

    public GetVmListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVmListResponse setBody(GetVmListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVmListResponseBody getBody() {
        return this.body;
    }

}
