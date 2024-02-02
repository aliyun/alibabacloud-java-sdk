// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CheckBindLicenseDeviceProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBindLicenseDeviceProgressResponseBody body;

    public static CheckBindLicenseDeviceProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBindLicenseDeviceProgressResponse self = new CheckBindLicenseDeviceProgressResponse();
        return TeaModel.build(map, self);
    }

    public CheckBindLicenseDeviceProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBindLicenseDeviceProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBindLicenseDeviceProgressResponse setBody(CheckBindLicenseDeviceProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBindLicenseDeviceProgressResponseBody getBody() {
        return this.body;
    }

}
