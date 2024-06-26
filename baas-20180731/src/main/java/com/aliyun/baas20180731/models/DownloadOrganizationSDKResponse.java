// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadOrganizationSDKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadOrganizationSDKResponseBody body;

    public static DownloadOrganizationSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrganizationSDKResponse self = new DownloadOrganizationSDKResponse();
        return TeaModel.build(map, self);
    }

    public DownloadOrganizationSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadOrganizationSDKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadOrganizationSDKResponse setBody(DownloadOrganizationSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadOrganizationSDKResponseBody getBody() {
        return this.body;
    }

}
