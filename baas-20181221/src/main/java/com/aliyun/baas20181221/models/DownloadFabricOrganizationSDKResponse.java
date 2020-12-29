// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DownloadFabricOrganizationSDKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadFabricOrganizationSDKResponseBody body;

    public static DownloadFabricOrganizationSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricOrganizationSDKResponse self = new DownloadFabricOrganizationSDKResponse();
        return TeaModel.build(map, self);
    }

    public DownloadFabricOrganizationSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadFabricOrganizationSDKResponse setBody(DownloadFabricOrganizationSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadFabricOrganizationSDKResponseBody getBody() {
        return this.body;
    }

}
