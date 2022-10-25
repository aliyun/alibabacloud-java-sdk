// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryMemberWithExternUidResponseBody body;

    public static DeleteRepositoryMemberWithExternUidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberWithExternUidResponse self = new DeleteRepositoryMemberWithExternUidResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberWithExternUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryMemberWithExternUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepositoryMemberWithExternUidResponse setBody(DeleteRepositoryMemberWithExternUidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryMemberWithExternUidResponseBody getBody() {
        return this.body;
    }

}
