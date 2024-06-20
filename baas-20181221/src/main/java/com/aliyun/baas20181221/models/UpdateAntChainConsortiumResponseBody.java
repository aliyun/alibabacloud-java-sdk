// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainConsortiumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1E55C947-19B4-4AAD-9D22-0B8DA8904B3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
