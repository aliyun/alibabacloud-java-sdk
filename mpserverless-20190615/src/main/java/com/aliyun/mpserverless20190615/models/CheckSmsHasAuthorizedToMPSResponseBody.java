// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckSmsHasAuthorizedToMPSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsAuthorized")
    public Boolean isAuthorized;

    public static CheckSmsHasAuthorizedToMPSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsHasAuthorizedToMPSResponseBody self = new CheckSmsHasAuthorizedToMPSResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSmsHasAuthorizedToMPSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSmsHasAuthorizedToMPSResponseBody setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

}
