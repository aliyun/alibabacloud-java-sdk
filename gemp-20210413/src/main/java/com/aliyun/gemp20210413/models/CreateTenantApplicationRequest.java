// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateTenantApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DINGDING</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7C56D225-7C34-40BB-9624-C8BA449260E6</p>
     */
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
