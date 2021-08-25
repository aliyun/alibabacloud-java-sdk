// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteRepositoryMemberWithExternUidResponse setBody(DeleteRepositoryMemberWithExternUidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryMemberWithExternUidResponseBody getBody() {
        return this.body;
    }

}
