// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDirectorySsoStatusResponseBody extends TeaModel {
    @NameInMap("SsoStatus")
    public Boolean ssoStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDirectorySsoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySsoStatusResponseBody self = new GetDirectorySsoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectorySsoStatusResponseBody setSsoStatus(Boolean ssoStatus) {
        this.ssoStatus = ssoStatus;
        return this;
    }
    public Boolean getSsoStatus() {
        return this.ssoStatus;
    }

    public GetDirectorySsoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
