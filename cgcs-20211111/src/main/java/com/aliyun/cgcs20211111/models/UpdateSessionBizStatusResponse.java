// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class UpdateSessionBizStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSessionBizStatusResponseBody body;

    public static UpdateSessionBizStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionBizStatusResponse self = new UpdateSessionBizStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSessionBizStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSessionBizStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSessionBizStatusResponse setBody(UpdateSessionBizStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSessionBizStatusResponseBody getBody() {
        return this.body;
    }

}
