// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class SwitchClusterMasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchClusterMasterResponseBody body;

    public static SwitchClusterMasterResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchClusterMasterResponse self = new SwitchClusterMasterResponse();
        return TeaModel.build(map, self);
    }

    public SwitchClusterMasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchClusterMasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchClusterMasterResponse setBody(SwitchClusterMasterResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchClusterMasterResponseBody getBody() {
        return this.body;
    }

}
