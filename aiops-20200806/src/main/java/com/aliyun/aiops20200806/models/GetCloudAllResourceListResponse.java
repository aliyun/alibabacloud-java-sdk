// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudAllResourceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCloudAllResourceListResponseBody body;

    public static GetCloudAllResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAllResourceListResponse self = new GetCloudAllResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAllResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAllResourceListResponse setBody(GetCloudAllResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAllResourceListResponseBody getBody() {
        return this.body;
    }

}
