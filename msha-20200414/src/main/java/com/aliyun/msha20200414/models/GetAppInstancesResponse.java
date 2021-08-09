// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppInstancesResponseBody body;

    public static GetAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstancesResponse self = new GetAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstancesResponse setBody(GetAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstancesResponseBody getBody() {
        return this.body;
    }

}
