// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInspectionTaskResponseBody body;

    public static GetInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionTaskResponse self = new GetInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInspectionTaskResponse setBody(GetInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
