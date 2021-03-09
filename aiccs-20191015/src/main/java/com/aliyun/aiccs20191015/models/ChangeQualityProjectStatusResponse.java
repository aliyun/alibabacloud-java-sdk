// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ChangeQualityProjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeQualityProjectStatusResponseBody body;

    public static ChangeQualityProjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeQualityProjectStatusResponse self = new ChangeQualityProjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeQualityProjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeQualityProjectStatusResponse setBody(ChangeQualityProjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeQualityProjectStatusResponseBody getBody() {
        return this.body;
    }

}
