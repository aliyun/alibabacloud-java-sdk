// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGroupMonitoringAgentProcessResponseBody body;

    public static ModifyGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessResponse self = new ModifyGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGroupMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGroupMonitoringAgentProcessResponse setBody(ModifyGroupMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
