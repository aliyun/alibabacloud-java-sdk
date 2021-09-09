// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallKibanaPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static UninstallKibanaPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallKibanaPluginResponseBody self = new UninstallKibanaPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallKibanaPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallKibanaPluginResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
