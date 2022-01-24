// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySendStatisticsResponseBody body;

    public static QuerySendStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendStatisticsResponse self = new QuerySendStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendStatisticsResponse setBody(QuerySendStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendStatisticsResponseBody getBody() {
        return this.body;
    }

}
