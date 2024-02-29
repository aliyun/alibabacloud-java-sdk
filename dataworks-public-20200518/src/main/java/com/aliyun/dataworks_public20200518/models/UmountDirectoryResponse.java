// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UmountDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UmountDirectoryResponseBody body;

    public static UmountDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UmountDirectoryResponse self = new UmountDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UmountDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UmountDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UmountDirectoryResponse setBody(UmountDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UmountDirectoryResponseBody getBody() {
        return this.body;
    }

}
