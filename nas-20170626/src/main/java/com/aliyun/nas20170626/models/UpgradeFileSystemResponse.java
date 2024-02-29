// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeFileSystemResponseBody body;

    public static UpgradeFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFileSystemResponse self = new UpgradeFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeFileSystemResponse setBody(UpgradeFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeFileSystemResponseBody getBody() {
        return this.body;
    }

}
