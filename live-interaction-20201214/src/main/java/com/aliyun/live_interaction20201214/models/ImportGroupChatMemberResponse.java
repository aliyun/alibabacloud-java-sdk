// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportGroupChatMemberResponseBody body;

    public static ImportGroupChatMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatMemberResponse self = new ImportGroupChatMemberResponse();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportGroupChatMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportGroupChatMemberResponse setBody(ImportGroupChatMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportGroupChatMemberResponseBody getBody() {
        return this.body;
    }

}
