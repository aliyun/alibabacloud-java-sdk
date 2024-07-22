// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallUserPluginsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6F*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static InstallUserPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallUserPluginsResponseBody self = new InstallUserPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallUserPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallUserPluginsResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
