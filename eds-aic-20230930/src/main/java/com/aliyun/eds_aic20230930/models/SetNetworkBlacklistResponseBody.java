// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetNetworkBlacklistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2B9E6946-0E2A-5D2B-B275-361DF81F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetNetworkBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetNetworkBlacklistResponseBody self = new SetNetworkBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public SetNetworkBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
