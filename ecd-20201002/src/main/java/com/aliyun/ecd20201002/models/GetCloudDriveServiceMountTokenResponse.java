// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetCloudDriveServiceMountTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudDriveServiceMountTokenResponseBody body;

    public static GetCloudDriveServiceMountTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudDriveServiceMountTokenResponse self = new GetCloudDriveServiceMountTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudDriveServiceMountTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudDriveServiceMountTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudDriveServiceMountTokenResponse setBody(GetCloudDriveServiceMountTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudDriveServiceMountTokenResponseBody getBody() {
        return this.body;
    }

}
