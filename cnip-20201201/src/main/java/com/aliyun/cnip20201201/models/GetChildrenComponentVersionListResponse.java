// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetChildrenComponentVersionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetChildrenComponentVersionListResponseBody body;

    public static GetChildrenComponentVersionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChildrenComponentVersionListResponse self = new GetChildrenComponentVersionListResponse();
        return TeaModel.build(map, self);
    }

    public GetChildrenComponentVersionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChildrenComponentVersionListResponse setBody(GetChildrenComponentVersionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChildrenComponentVersionListResponseBody getBody() {
        return this.body;
    }

}
