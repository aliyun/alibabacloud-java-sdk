// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DisableKibanaPvlNetworkResponseBody extends TeaModel {
    /**
     * <p>request id</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1DERFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
