// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateWebhookResponseBody extends TeaModel {
    /**
     * <p>The result returned. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The modification is successful.</li>
     * <li><code>false</code>: The modification fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16AF921B-8187-489F-9913-43C808B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebhookResponseBody self = new UpdateWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWebhookResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
