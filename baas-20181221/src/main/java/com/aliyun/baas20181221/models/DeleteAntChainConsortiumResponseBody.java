// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainConsortiumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F3685787-9F2F-4D60-ADD6-07A5179552CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static DeleteAntChainConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainConsortiumResponseBody self = new DeleteAntChainConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAntChainConsortiumResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
