// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddDriveSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDriveSpaceResponseBody body;

    public static AddDriveSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDriveSpaceResponse self = new AddDriveSpaceResponse();
        return TeaModel.build(map, self);
    }

    public AddDriveSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDriveSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDriveSpaceResponse setBody(AddDriveSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDriveSpaceResponseBody getBody() {
        return this.body;
    }

}
