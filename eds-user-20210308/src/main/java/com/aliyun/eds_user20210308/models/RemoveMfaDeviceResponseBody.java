// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveMfaDeviceResponseBody extends TeaModel {
    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveMfaDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMfaDeviceResponseBody self = new RemoveMfaDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMfaDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
