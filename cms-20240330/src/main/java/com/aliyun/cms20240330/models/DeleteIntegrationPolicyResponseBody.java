// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteIntegrationPolicyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteIntegrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationPolicyResponseBody self = new DeleteIntegrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
