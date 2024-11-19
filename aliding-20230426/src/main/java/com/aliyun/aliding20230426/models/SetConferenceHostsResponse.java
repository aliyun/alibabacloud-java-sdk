// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetConferenceHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetConferenceHostsResponseBody body;

    public static SetConferenceHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetConferenceHostsResponse self = new SetConferenceHostsResponse();
        return TeaModel.build(map, self);
    }

    public SetConferenceHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetConferenceHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetConferenceHostsResponse setBody(SetConferenceHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetConferenceHostsResponseBody getBody() {
        return this.body;
    }

}
