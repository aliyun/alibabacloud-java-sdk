// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupMemberByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGroupMemberByIdsResponseBody body;

    public static GetGroupMemberByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMemberByIdsResponse self = new GetGroupMemberByIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupMemberByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupMemberByIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupMemberByIdsResponse setBody(GetGroupMemberByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupMemberByIdsResponseBody getBody() {
        return this.body;
    }

}
