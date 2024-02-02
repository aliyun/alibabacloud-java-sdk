// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSubTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceSubTopicResponseBody body;

    public static QueryDeviceSubTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSubTopicResponse self = new QueryDeviceSubTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSubTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceSubTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceSubTopicResponse setBody(QueryDeviceSubTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceSubTopicResponseBody getBody() {
        return this.body;
    }

}
