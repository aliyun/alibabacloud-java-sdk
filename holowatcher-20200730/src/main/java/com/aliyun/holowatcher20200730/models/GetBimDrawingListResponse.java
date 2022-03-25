// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimDrawingListResponseBody body;

    public static GetBimDrawingListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingListResponse self = new GetBimDrawingListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimDrawingListResponse setBody(GetBimDrawingListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimDrawingListResponseBody getBody() {
        return this.body;
    }

}
