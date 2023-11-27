// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SilenceAllGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SilenceAllGroupMembersResponseBody body;

    public static SilenceAllGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        SilenceAllGroupMembersResponse self = new SilenceAllGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public SilenceAllGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SilenceAllGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SilenceAllGroupMembersResponse setBody(SilenceAllGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public SilenceAllGroupMembersResponseBody getBody() {
        return this.body;
    }

}
