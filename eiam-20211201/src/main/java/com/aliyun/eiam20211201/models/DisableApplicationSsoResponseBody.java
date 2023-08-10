// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationSsoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableApplicationSsoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationSsoResponseBody self = new DisableApplicationSsoResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableApplicationSsoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
