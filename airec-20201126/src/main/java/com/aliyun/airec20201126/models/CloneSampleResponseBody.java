// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CloneSampleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public Sample result;

    public static CloneSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneSampleResponseBody self = new CloneSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneSampleResponseBody setResult(Sample result) {
        this.result = result;
        return this;
    }
    public Sample getResult() {
        return this.result;
    }

}
