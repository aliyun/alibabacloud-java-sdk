// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CancelSilenceAllGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelSilenceAllGroupMembersResponseBody body;

    public static CancelSilenceAllGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSilenceAllGroupMembersResponse self = new CancelSilenceAllGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public CancelSilenceAllGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSilenceAllGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSilenceAllGroupMembersResponse setBody(CancelSilenceAllGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSilenceAllGroupMembersResponseBody getBody() {
        return this.body;
    }

}
