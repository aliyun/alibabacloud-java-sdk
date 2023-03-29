// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class EnableRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to enable real-time log delivery. You can specify multiple domain names and separate them with commas (,).</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static EnableRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRealtimeLogDeliveryRequest self = new EnableRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
