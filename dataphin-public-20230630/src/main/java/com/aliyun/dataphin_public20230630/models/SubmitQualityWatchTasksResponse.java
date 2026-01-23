// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityWatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitQualityWatchTasksResponseBody body;

    public static SubmitQualityWatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityWatchTasksResponse self = new SubmitQualityWatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public SubmitQualityWatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitQualityWatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitQualityWatchTasksResponse setBody(SubmitQualityWatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitQualityWatchTasksResponseBody getBody() {
        return this.body;
    }

}
