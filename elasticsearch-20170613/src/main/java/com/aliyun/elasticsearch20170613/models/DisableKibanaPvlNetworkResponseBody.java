// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DisableKibanaPvlNetworkResponseBody extends TeaModel {
    /**
     * <p>request id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DisableKibanaPvlNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableKibanaPvlNetworkResponseBody self = new DisableKibanaPvlNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableKibanaPvlNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableKibanaPvlNetworkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
