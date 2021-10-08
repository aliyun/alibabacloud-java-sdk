// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegionListResponseBody body;

    public static GetRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionListResponse self = new GetRegionListResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionListResponse setBody(GetRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionListResponseBody getBody() {
        return this.body;
    }

}
