// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizMetricByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBizMetricByNameResponseBody body;

    public static GetBizMetricByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizMetricByNameResponse self = new GetBizMetricByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetBizMetricByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizMetricByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizMetricByNameResponse setBody(GetBizMetricByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizMetricByNameResponseBody getBody() {
        return this.body;
    }

}
