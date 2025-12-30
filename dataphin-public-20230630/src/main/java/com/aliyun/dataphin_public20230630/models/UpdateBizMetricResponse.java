// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizMetricResponseBody body;

    public static UpdateBizMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizMetricResponse self = new UpdateBizMetricResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizMetricResponse setBody(UpdateBizMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizMetricResponseBody getBody() {
        return this.body;
    }

}
