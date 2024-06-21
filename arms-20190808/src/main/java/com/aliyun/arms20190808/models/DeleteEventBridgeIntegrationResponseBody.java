// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEventBridgeIntegrationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the EventBridge integration is deleted.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2B289756-E791-5842-BCBD-AD414C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEventBridgeIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventBridgeIntegrationResponseBody self = new DeleteEventBridgeIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventBridgeIntegrationResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteEventBridgeIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
