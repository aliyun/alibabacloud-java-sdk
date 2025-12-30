// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBizMetricResponseBody body;

    public static CreateBizMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizMetricResponse self = new CreateBizMetricResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizMetricResponse setBody(CreateBizMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizMetricResponseBody getBody() {
        return this.body;
    }

}
