// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteUserHdfsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserHdfsInfoResponseBody body;

    public static DeleteUserHdfsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserHdfsInfoResponse self = new DeleteUserHdfsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserHdfsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserHdfsInfoResponse setBody(DeleteUserHdfsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

}
