// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoBuildRecordResponseBody body;

    public static GetRepoBuildRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordResponse self = new GetRepoBuildRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoBuildRecordResponse setBody(GetRepoBuildRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

}
