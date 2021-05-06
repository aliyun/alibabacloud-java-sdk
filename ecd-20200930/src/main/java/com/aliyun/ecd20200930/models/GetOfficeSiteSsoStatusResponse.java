// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetOfficeSiteSsoStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SsoStatus")
    @Validation(required = true)
    public Boolean ssoStatus;

    public static GetOfficeSiteSsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeSiteSsoStatusResponse self = new GetOfficeSiteSsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOfficeSiteSsoStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfficeSiteSsoStatusResponse setSsoStatus(Boolean ssoStatus) {
        this.ssoStatus = ssoStatus;
        return this;
    }
    public Boolean getSsoStatus() {
        return this.ssoStatus;
    }

}
