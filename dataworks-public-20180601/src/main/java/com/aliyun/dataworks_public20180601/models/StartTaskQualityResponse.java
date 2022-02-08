// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartTaskQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartTaskQualityResponseBody body;

    public static StartTaskQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTaskQualityResponse self = new StartTaskQualityResponse();
        return TeaModel.build(map, self);
    }

    public StartTaskQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTaskQualityResponse setBody(StartTaskQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTaskQualityResponseBody getBody() {
        return this.body;
    }

}
