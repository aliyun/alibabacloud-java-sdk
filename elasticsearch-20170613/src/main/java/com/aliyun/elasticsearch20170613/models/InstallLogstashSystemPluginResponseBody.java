// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallLogstashSystemPluginResponseBody extends TeaModel {
    /**
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Result")
    public java.util.List<String> result;

    public static InstallLogstashSystemPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallLogstashSystemPluginResponseBody self = new InstallLogstashSystemPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallLogstashSystemPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallLogstashSystemPluginResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
