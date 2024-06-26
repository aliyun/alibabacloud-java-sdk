// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainQRCodeAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UpdateAntChainQRCodeAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainQRCodeAuthorizationResponseBody self = new UpdateAntChainQRCodeAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainQRCodeAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainQRCodeAuthorizationResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
