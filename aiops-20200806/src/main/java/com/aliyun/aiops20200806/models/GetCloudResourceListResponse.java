// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCloudResourceListResponseBody body;

    public static GetCloudResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceListResponse self = new GetCloudResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudResourceListResponse setBody(GetCloudResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudResourceListResponseBody getBody() {
        return this.body;
    }

}
