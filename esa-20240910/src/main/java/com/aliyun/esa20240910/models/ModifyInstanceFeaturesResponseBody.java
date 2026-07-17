// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifyInstanceFeaturesResponseBody extends TeaModel {
    /**
     * <p>The site feature configurations that failed to be modified.</p>
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
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceFeaturesResponseBody self = new ModifyInstanceFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceFeaturesResponseBody setFailedFeatures(String failedFeatures) {
        this.failedFeatures = failedFeatures;
        return this;
    }
    public String getFailedFeatures() {
        return this.failedFeatures;
    }

    public ModifyInstanceFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
