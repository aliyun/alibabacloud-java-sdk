// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowProjectClusterSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFlowProjectClusterSettingResponseBody body;

    public static ModifyFlowProjectClusterSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowProjectClusterSettingResponse self = new ModifyFlowProjectClusterSettingResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowProjectClusterSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowProjectClusterSettingResponse setBody(ModifyFlowProjectClusterSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

}
