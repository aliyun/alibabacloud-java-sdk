// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ShrinkNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Command output:</p>
     * <br>
     * <p>*   true: The scale-in is successful.</p>
     * <p>*   false: The scale-in failed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ShrinkNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShrinkNodeResponseBody self = new ShrinkNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ShrinkNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShrinkNodeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
