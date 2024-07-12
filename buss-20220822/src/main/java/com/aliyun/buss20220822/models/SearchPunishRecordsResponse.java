// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchPunishRecordsResponseBody body;

    public static SearchPunishRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRecordsResponse self = new SearchPunishRecordsResponse();
        return TeaModel.build(map, self);
    }

    public SearchPunishRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPunishRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPunishRecordsResponse setBody(SearchPunishRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPunishRecordsResponseBody getBody() {
        return this.body;
    }

}
