// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeKernelVersionResponseBody body;

    public static UpgradeKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeKernelVersionResponse self = new UpgradeKernelVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeKernelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeKernelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeKernelVersionResponse setBody(UpgradeKernelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeKernelVersionResponseBody getBody() {
        return this.body;
    }

}
