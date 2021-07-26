// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpaceModelInstanceResponseBody body;

    public static GetSpaceModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelInstanceResponse self = new GetSpaceModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpaceModelInstanceResponse setBody(GetSpaceModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpaceModelInstanceResponseBody getBody() {
        return this.body;
    }

}
