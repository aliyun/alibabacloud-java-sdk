// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SSO is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SsoStatus")
    public Boolean ssoStatus;

    public static GetOfficeSiteSsoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeSiteSsoStatusResponseBody self = new GetOfficeSiteSsoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfficeSiteSsoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfficeSiteSsoStatusResponseBody setSsoStatus(Boolean ssoStatus) {
        this.ssoStatus = ssoStatus;
        return this;
    }
    public Boolean getSsoStatus() {
        return this.ssoStatus;
    }

}
