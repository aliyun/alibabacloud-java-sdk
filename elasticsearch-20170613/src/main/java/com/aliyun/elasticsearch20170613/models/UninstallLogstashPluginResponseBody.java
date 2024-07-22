// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallLogstashPluginResponseBody extends TeaModel {
    @NameInMap("Headers")
    public java.util.Map<String, ?> headers;

    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static UninstallLogstashPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallLogstashPluginResponseBody self = new UninstallLogstashPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallLogstashPluginResponseBody setHeaders(java.util.Map<String, ?> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, ?> getHeaders() {
        return this.headers;
    }

    public UninstallLogstashPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallLogstashPluginResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
