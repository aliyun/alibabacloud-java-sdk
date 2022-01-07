// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobDriverLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSparkJobDriverLogResponseBody body;

    public static GetSparkJobDriverLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobDriverLogResponse self = new GetSparkJobDriverLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkJobDriverLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkJobDriverLogResponse setBody(GetSparkJobDriverLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkJobDriverLogResponseBody getBody() {
        return this.body;
    }

}
