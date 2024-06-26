// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChannelMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChannelMemberResponseBody body;

    public static CreateChannelMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelMemberResponse self = new CreateChannelMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateChannelMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChannelMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChannelMemberResponse setBody(CreateChannelMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChannelMemberResponseBody getBody() {
        return this.body;
    }

}
