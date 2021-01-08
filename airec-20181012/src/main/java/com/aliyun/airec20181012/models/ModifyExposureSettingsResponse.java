// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyExposureSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyExposureSettingsResponseBody body;

    public static ModifyExposureSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExposureSettingsResponse self = new ModifyExposureSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExposureSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExposureSettingsResponse setBody(ModifyExposureSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExposureSettingsResponseBody getBody() {
        return this.body;
    }

}
