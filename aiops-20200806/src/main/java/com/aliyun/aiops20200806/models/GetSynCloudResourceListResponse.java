// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSynCloudResourceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSynCloudResourceListResponseBody body;

    public static GetSynCloudResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSynCloudResourceListResponse self = new GetSynCloudResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetSynCloudResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSynCloudResourceListResponse setBody(GetSynCloudResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSynCloudResourceListResponseBody getBody() {
        return this.body;
    }

}
