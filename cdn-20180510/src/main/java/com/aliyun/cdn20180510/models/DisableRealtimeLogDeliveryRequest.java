// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DisableRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to disable real-time log delivery. You can specify multiple domain names and separate them with commas (,).</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static DisableRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableRealtimeLogDeliveryRequest self = new DisableRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
