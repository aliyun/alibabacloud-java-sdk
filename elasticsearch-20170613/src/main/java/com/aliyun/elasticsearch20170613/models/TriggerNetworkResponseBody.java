// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static TriggerNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerNetworkResponseBody self = new TriggerNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerNetworkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public TriggerNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
