// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelSortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpaceModelSortResponseBody body;

    public static GetSpaceModelSortResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelSortResponse self = new GetSpaceModelSortResponse();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelSortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpaceModelSortResponse setBody(GetSpaceModelSortResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpaceModelSortResponseBody getBody() {
        return this.body;
    }

}
