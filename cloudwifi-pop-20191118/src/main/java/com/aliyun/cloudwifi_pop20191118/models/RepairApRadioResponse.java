// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RepairApRadioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RepairApRadioResponseBody body;

    public static RepairApRadioResponse build(java.util.Map<String, ?> map) throws Exception {
        RepairApRadioResponse self = new RepairApRadioResponse();
        return TeaModel.build(map, self);
    }

    public RepairApRadioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepairApRadioResponse setBody(RepairApRadioResponseBody body) {
        this.body = body;
        return this;
    }
    public RepairApRadioResponseBody getBody() {
        return this.body;
    }

}
