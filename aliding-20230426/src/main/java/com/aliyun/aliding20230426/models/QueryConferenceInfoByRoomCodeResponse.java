// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoByRoomCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConferenceInfoByRoomCodeResponseBody body;

    public static QueryConferenceInfoByRoomCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoByRoomCodeResponse self = new QueryConferenceInfoByRoomCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoByRoomCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConferenceInfoByRoomCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConferenceInfoByRoomCodeResponse setBody(QueryConferenceInfoByRoomCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConferenceInfoByRoomCodeResponseBody getBody() {
        return this.body;
    }

}
