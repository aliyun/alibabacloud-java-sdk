// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableServiceGroupWebhookRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static DisableServiceGroupWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableServiceGroupWebhookRequest self = new DisableServiceGroupWebhookRequest();
        return TeaModel.build(map, self);
    }

    public DisableServiceGroupWebhookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableServiceGroupWebhookRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
