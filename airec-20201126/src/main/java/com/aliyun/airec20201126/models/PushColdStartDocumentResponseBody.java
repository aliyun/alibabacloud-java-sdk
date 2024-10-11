// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushColdStartDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7585C2B2-0D61-4C96-AC5D-B960BFEDD4A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static PushColdStartDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushColdStartDocumentResponseBody self = new PushColdStartDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public PushColdStartDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushColdStartDocumentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
