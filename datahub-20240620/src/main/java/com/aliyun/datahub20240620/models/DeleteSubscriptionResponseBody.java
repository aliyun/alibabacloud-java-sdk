// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026031915480122c53d0b00c2d347</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionResponseBody self = new DeleteSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
