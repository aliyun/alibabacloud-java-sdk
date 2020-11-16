// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveDomainRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealtimeLogDeliveryRequest self = new DescribeLiveDomainRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
