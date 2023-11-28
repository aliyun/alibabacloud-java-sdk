// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the billing method of the cluster is switched. Valid values:</p>
     * <br>
     * <p>*   true: The billing method is switched.</p>
     * <p>*   false: The billing method fails to be switched.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateLogstashChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashChargeTypeResponseBody self = new UpdateLogstashChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLogstashChargeTypeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
