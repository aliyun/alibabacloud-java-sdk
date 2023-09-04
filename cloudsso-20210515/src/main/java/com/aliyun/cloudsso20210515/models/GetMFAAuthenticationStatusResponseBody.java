// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationStatusResponseBody extends TeaModel {
    /**
     * <p>The status of MFA. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     */
    @NameInMap("MFAAuthenticationStatus")
    public String MFAAuthenticationStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMFAAuthenticationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationStatusResponseBody self = new GetMFAAuthenticationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationStatusResponseBody setMFAAuthenticationStatus(String MFAAuthenticationStatus) {
        this.MFAAuthenticationStatus = MFAAuthenticationStatus;
        return this;
    }
    public String getMFAAuthenticationStatus() {
        return this.MFAAuthenticationStatus;
    }

    public GetMFAAuthenticationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
