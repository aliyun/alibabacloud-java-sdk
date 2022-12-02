// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DownloadDeviceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadDeviceResourceResponseBody body;

    public static DownloadDeviceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDeviceResourceResponse self = new DownloadDeviceResourceResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDeviceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDeviceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDeviceResourceResponse setBody(DownloadDeviceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDeviceResourceResponseBody getBody() {
        return this.body;
    }

}
