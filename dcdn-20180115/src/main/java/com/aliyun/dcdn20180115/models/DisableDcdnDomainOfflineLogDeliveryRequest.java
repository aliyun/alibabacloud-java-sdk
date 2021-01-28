// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnDomainOfflineLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    public static DisableDcdnDomainOfflineLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnDomainOfflineLogDeliveryRequest self = new DisableDcdnDomainOfflineLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableDcdnDomainOfflineLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisableDcdnDomainOfflineLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
