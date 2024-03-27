// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLhMembersResponseBody body;

    public static AddLhMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLhMembersResponse self = new AddLhMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddLhMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLhMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLhMembersResponse setBody(AddLhMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLhMembersResponseBody getBody() {
        return this.body;
    }

}
