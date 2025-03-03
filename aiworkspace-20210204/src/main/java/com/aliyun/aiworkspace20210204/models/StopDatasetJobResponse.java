// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class StopDatasetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDatasetJobResponseBody body;

    public static StopDatasetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDatasetJobResponse self = new StopDatasetJobResponse();
        return TeaModel.build(map, self);
    }

    public StopDatasetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDatasetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDatasetJobResponse setBody(StopDatasetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDatasetJobResponseBody getBody() {
        return this.body;
    }

}
