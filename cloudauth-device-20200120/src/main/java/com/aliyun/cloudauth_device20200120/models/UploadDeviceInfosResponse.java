// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class UploadDeviceInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDeviceInfosResponseBody body;

    public static UploadDeviceInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceInfosResponse self = new UploadDeviceInfosResponse();
        return TeaModel.build(map, self);
    }

    public UploadDeviceInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDeviceInfosResponse setBody(UploadDeviceInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDeviceInfosResponseBody getBody() {
        return this.body;
    }

}
