// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOTADynamicUpgradeJobResponseBody body;

    public static CreateOTADynamicUpgradeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobResponse self = new CreateOTADynamicUpgradeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOTADynamicUpgradeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOTADynamicUpgradeJobResponse setBody(CreateOTADynamicUpgradeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOTADynamicUpgradeJobResponseBody getBody() {
        return this.body;
    }

}
