// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryRequest extends TeaModel {
    // The accelerated domain name for which real-time log delivery is enabled. Only one domain name is supported.
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDomainRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealtimeLogDeliveryRequest self = new DescribeDomainRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
