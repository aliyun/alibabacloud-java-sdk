// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelRecycleBinJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelRecycleBinJobResponseBody body;

    public static CancelRecycleBinJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRecycleBinJobResponse self = new CancelRecycleBinJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelRecycleBinJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRecycleBinJobResponse setBody(CancelRecycleBinJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRecycleBinJobResponseBody getBody() {
        return this.body;
    }

}
