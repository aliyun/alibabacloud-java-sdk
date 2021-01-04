// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpLogResponseBody body;

    public static GetOpLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogResponse self = new GetOpLogResponse();
        return TeaModel.build(map, self);
    }

    public GetOpLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpLogResponse setBody(GetOpLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpLogResponseBody getBody() {
        return this.body;
    }

}
