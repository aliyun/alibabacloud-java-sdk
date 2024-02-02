// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAStaticUpgradeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOTAStaticUpgradeJobResponseBody body;

    public static CreateOTAStaticUpgradeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAStaticUpgradeJobResponse self = new CreateOTAStaticUpgradeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAStaticUpgradeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOTAStaticUpgradeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOTAStaticUpgradeJobResponse setBody(CreateOTAStaticUpgradeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOTAStaticUpgradeJobResponseBody getBody() {
        return this.body;
    }

}
