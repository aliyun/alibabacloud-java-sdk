// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopApmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEC32FE6-4697-5110-9668-C6016EAEB5DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StopApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopApmResponseBody self = new StopApmResponseBody();
        return TeaModel.build(map, self);
    }

    public StopApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopApmResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
