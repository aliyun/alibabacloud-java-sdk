// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RebuildIndexResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public String result;

    public static RebuildIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildIndexResponseBody self = new RebuildIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildIndexResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
