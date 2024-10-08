// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableServiceGroupWebhookResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableServiceGroupWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceGroupWebhookResponseBody self = new EnableServiceGroupWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceGroupWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
