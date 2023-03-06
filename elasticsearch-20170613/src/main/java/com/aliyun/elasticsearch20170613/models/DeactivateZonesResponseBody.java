// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeactivateZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: offline zone successfully</p>
     * <p>*   false: offline zone successfully failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeactivateZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactivateZonesResponseBody self = new DeactivateZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactivateZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeactivateZonesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
