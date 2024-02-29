// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFolderResponseBody body;

    public static DeleteFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFolderResponse self = new DeleteFolderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFolderResponse setBody(DeleteFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFolderResponseBody getBody() {
        return this.body;
    }

}
