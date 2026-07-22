// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchResponseBody extends TeaModel {
    /**
     * <p>Indicates whether only a dry run was performed. If this parameter is true, the system performed pre-checks such as parameter validity, identity permissions, resource existence, quota limits, and dependency relationships without creating, updating, or deleting actual resources, triggering asynchronous traffic diversion tasks, or generating downstream side effects such as billing, notifications, or callbacks. If the dry run succeeded, DryRun=true is returned in the response, which can be distinguished from an actual call response. If the dry run failed, a machine-readable error code is returned (such as ErrorParamsInvalid for parameter errors, ErrorAuthentication for insufficient permissions, or ErrorInstanceOpenIpNumExceed for insufficient quota). A value of false (default) indicates that the request was initiated and the enable operation was performed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutDisableFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDisableFwSwitchResponseBody self = new PutDisableFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDisableFwSwitchResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PutDisableFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
