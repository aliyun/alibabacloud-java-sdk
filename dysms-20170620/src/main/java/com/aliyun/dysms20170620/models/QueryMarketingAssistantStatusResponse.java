// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMarketingAssistantStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMarketingAssistantStatusResponseBody body;

    public static QueryMarketingAssistantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketingAssistantStatusResponse self = new QueryMarketingAssistantStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarketingAssistantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMarketingAssistantStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMarketingAssistantStatusResponse setBody(QueryMarketingAssistantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMarketingAssistantStatusResponseBody getBody() {
        return this.body;
    }

}
