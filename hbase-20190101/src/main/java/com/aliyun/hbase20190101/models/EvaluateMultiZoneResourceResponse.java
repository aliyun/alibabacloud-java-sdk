// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EvaluateMultiZoneResourceResponseBody body;

    public static EvaluateMultiZoneResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateMultiZoneResourceResponse self = new EvaluateMultiZoneResourceResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateMultiZoneResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateMultiZoneResourceResponse setBody(EvaluateMultiZoneResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateMultiZoneResourceResponseBody getBody() {
        return this.body;
    }

}
