// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallDetailRecordResponseBody body;

    public static GetCallDetailRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallDetailRecordResponse self = new GetCallDetailRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetCallDetailRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallDetailRecordResponse setBody(GetCallDetailRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallDetailRecordResponseBody getBody() {
        return this.body;
    }

}
