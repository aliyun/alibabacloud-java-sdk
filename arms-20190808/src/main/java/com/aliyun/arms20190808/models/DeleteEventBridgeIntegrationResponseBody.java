// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEventBridgeIntegrationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the EventBridge integration is deleted.</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
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
