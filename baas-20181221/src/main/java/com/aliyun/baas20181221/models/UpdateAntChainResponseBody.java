// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F6A52E53-2CCB-4C3C-A44D-45FAEBC24E47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateAntChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainResponseBody self = new UpdateAntChainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
