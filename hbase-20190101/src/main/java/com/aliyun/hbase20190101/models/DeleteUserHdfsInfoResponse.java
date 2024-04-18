// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteUserHdfsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteUserHdfsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserHdfsInfoResponse setBody(DeleteUserHdfsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

}
