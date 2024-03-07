// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaPvlNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static UpdateKibanaPvlNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaPvlNetworkResponseBody self = new UpdateKibanaPvlNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaPvlNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKibanaPvlNetworkResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
