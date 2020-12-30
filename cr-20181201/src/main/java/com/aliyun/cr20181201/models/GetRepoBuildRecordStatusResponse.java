// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoBuildRecordStatusResponseBody body;

    public static GetRepoBuildRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusResponse self = new GetRepoBuildRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoBuildRecordStatusResponse setBody(GetRepoBuildRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoBuildRecordStatusResponseBody getBody() {
        return this.body;
    }

}
