// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchPunishEventsResponseBody body;

    public static SearchPunishEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishEventsResponse self = new SearchPunishEventsResponse();
        return TeaModel.build(map, self);
    }

    public SearchPunishEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPunishEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPunishEventsResponse setBody(SearchPunishEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPunishEventsResponseBody getBody() {
        return this.body;
    }

}
