// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Domain")
    public String domain;

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

}
