// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UploadDeviceNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDeviceNameListResponseBody body;

    public static UploadDeviceNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceNameListResponse self = new UploadDeviceNameListResponse();
        return TeaModel.build(map, self);
    }

    public UploadDeviceNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDeviceNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDeviceNameListResponse setBody(UploadDeviceNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDeviceNameListResponseBody getBody() {
        return this.body;
    }

}
