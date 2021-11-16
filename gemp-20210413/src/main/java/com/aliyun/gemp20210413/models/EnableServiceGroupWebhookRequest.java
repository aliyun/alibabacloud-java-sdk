// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableServiceGroupWebhookRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static EnableServiceGroupWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceGroupWebhookRequest self = new EnableServiceGroupWebhookRequest();
        return TeaModel.build(map, self);
    }

    public EnableServiceGroupWebhookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableServiceGroupWebhookRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
