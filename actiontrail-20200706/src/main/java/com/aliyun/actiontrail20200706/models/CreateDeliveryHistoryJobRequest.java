// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateDeliveryHistoryJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and can be up to 64 characters in length.</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the trail for which you want to create a historical event delivery task.</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    public static CreateDeliveryHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryHistoryJobRequest self = new CreateDeliveryHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryHistoryJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeliveryHistoryJobRequest setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

}
