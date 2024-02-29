// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class MountDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MountDirectoryResponseBody body;

    public static MountDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        MountDirectoryResponse self = new MountDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public MountDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MountDirectoryResponse setBody(MountDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public MountDirectoryResponseBody getBody() {
        return this.body;
    }

}
