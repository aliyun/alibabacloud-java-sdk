// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether MFA is enabled for users. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MFAAuthenticationStatus")
    public String MFAAuthenticationStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E688346-DF1A-5537-9BFC-8A9974D29586</p>
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
