// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifySiteFeaturesResponseBody extends TeaModel {
    /**
     * <p>The site feature information that failed to be cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>loadbalance</p>
     */
    @NameInMap("FailedFeatures")
    public String failedFeatures;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySiteFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteFeaturesResponseBody self = new ModifySiteFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySiteFeaturesResponseBody setFailedFeatures(String failedFeatures) {
        this.failedFeatures = failedFeatures;
        return this;
    }
    public String getFailedFeatures() {
        return this.failedFeatures;
    }

    public ModifySiteFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
