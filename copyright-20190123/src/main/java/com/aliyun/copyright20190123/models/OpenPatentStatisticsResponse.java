// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OpenPatentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenPatentStatisticsResponseBody body;

    public static OpenPatentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenPatentStatisticsResponse self = new OpenPatentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public OpenPatentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenPatentStatisticsResponse setBody(OpenPatentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenPatentStatisticsResponseBody getBody() {
        return this.body;
    }

}
