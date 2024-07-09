// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which real-time log delivery is enabled. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
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
