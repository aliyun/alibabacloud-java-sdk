// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainConsortiumResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UpdateAntChainConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainConsortiumResponseBody self = new UpdateAntChainConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainConsortiumResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
