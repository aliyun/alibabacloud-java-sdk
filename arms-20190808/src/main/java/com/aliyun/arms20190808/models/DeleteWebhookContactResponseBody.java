// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteWebhookContactResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the webhook alert contact was successfully deleted.</p>
     * <br>
     * <p>*   `true`: The specified data is deleted.</p>
     * <p>*   `false`: The specified data fails to be deleted.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebhookContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebhookContactResponseBody self = new DeleteWebhookContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebhookContactResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteWebhookContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
