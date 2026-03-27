// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateIntegrationPolicyResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateIntegrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationPolicyResponseBody self = new UpdateIntegrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
