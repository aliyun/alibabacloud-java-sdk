// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallKibanaSystemPluginResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of plug-ins to be installed.</p>
     */
    @NameInMap("Result")
    public java.util.List<String> result;

    public static InstallKibanaSystemPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallKibanaSystemPluginResponseBody self = new InstallKibanaSystemPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallKibanaSystemPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallKibanaSystemPluginResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
