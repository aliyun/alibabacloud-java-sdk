// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBizMetricResponseBody body;

    public static DeleteBizMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizMetricResponse self = new DeleteBizMetricResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBizMetricResponse setBody(DeleteBizMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizMetricResponseBody getBody() {
        return this.body;
    }

}
