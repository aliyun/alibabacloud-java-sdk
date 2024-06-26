// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteNotificationPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNotificationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationPolicyResponseBody self = new DeleteNotificationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationPolicyResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteNotificationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
