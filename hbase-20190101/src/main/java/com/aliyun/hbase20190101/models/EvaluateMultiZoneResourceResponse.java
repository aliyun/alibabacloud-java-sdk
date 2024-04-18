// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EvaluateMultiZoneResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateMultiZoneResourceResponse setBody(EvaluateMultiZoneResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateMultiZoneResourceResponseBody getBody() {
        return this.body;
    }

}
