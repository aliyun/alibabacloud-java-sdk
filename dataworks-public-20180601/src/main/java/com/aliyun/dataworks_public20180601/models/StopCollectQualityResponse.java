// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StopCollectQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopCollectQualityResponseBody body;

    public static StopCollectQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCollectQualityResponse self = new StopCollectQualityResponse();
        return TeaModel.build(map, self);
    }

    public StopCollectQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCollectQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCollectQualityResponse setBody(StopCollectQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCollectQualityResponseBody getBody() {
        return this.body;
    }

}
