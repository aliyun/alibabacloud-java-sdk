// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateTenantApplicationRequest extends TeaModel {
    // 应用协同渠道
    @NameInMap("channel")
    public String channel;

    // 幂等标识
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateTenantApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantApplicationRequest self = new CreateTenantApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantApplicationRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateTenantApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
