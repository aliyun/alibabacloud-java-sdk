// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDISyncTaskResponseBody body;

    public static GetDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponse self = new GetDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDISyncTaskResponse setBody(GetDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
