// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCloudDriveServiceResponseBody body;

    public static ModifyCloudDriveServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveServiceResponse self = new ModifyCloudDriveServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudDriveServiceResponse setBody(ModifyCloudDriveServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudDriveServiceResponseBody getBody() {
        return this.body;
    }

}
