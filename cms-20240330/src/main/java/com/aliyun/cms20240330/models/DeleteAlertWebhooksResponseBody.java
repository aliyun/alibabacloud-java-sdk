// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertWebhooksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E5B1D3D4-BB28-5996-8AD2-***********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAlertWebhooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertWebhooksResponseBody self = new DeleteAlertWebhooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertWebhooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
