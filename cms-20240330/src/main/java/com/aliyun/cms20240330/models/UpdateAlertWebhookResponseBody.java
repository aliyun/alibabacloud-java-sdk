// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8A33DBEA-<em><strong><strong>-</strong></strong></em>-<em><strong><strong>-</strong></strong></em></p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAlertWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertWebhookResponseBody self = new UpdateAlertWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
