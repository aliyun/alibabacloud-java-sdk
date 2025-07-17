// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFilesFromAuthorizedOssResponseBody body;

    public static AddFilesFromAuthorizedOssResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFilesFromAuthorizedOssResponse self = new AddFilesFromAuthorizedOssResponse();
        return TeaModel.build(map, self);
    }

    public AddFilesFromAuthorizedOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFilesFromAuthorizedOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFilesFromAuthorizedOssResponse setBody(AddFilesFromAuthorizedOssResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFilesFromAuthorizedOssResponseBody getBody() {
        return this.body;
    }

}
