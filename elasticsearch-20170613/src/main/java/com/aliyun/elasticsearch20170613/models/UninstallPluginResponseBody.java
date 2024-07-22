// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallPluginResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of plug-ins to be unloaded. If the unloading fails, an exception is returned.</p>
     */
    @NameInMap("Result")
    public java.util.List<String> result;

    public static UninstallPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallPluginResponseBody self = new UninstallPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallPluginResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
