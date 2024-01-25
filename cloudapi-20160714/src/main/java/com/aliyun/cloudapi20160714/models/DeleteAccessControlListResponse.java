// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessControlListResponseBody body;

    public static DeleteAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessControlListResponse self = new DeleteAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessControlListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessControlListResponse setBody(DeleteAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessControlListResponseBody getBody() {
        return this.body;
    }

}
