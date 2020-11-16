// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DisableLiveRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DisableLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLiveRealtimeLogDeliveryRequest self = new DisableLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableLiveRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
