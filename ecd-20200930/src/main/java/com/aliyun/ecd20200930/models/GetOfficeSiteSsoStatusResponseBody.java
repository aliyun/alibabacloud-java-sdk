// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
