// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A5D8E74-565C-43DC-B031-29289FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static TriggerNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerNetworkResponseBody self = new TriggerNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerNetworkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
