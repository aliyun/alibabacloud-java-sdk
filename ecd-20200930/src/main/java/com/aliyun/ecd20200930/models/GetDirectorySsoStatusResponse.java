// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDirectorySsoStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SsoStatus")
    @Validation(required = true)
    public Boolean ssoStatus;

    public static GetDirectorySsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySsoStatusResponse self = new GetDirectorySsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectorySsoStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDirectorySsoStatusResponse setSsoStatus(Boolean ssoStatus) {
        this.ssoStatus = ssoStatus;
        return this;
    }
    public Boolean getSsoStatus() {
        return this.ssoStatus;
    }

}
