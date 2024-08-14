// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateNetworkRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3bf02f7a-015b-4f34-be0f-cc043fda2d85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNetworkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkRuleResponseBody self = new UpdateNetworkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
