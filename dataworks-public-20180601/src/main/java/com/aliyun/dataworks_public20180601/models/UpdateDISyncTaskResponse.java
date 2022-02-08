// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDISyncTaskResponseBody body;

    public static UpdateDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponse self = new UpdateDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDISyncTaskResponse setBody(UpdateDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
