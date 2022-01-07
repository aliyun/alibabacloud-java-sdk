// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSparkJobLogResponseBody body;

    public static GetSparkJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobLogResponse self = new GetSparkJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkJobLogResponse setBody(GetSparkJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkJobLogResponseBody getBody() {
        return this.body;
    }

}
