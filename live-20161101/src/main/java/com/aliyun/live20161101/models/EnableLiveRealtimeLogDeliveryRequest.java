// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EnableLiveRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static EnableLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLiveRealtimeLogDeliveryRequest self = new EnableLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableLiveRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
