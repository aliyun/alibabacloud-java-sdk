// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoBuildRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelRepoBuildRecordResponseBody body;

    public static CancelRepoBuildRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoBuildRecordResponse self = new CancelRepoBuildRecordResponse();
        return TeaModel.build(map, self);
    }

    public CancelRepoBuildRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRepoBuildRecordResponse setBody(CancelRepoBuildRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

}
