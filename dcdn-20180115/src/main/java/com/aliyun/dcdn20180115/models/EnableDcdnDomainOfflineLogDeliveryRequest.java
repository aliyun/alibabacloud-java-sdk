// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EnableDcdnDomainOfflineLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    public static EnableDcdnDomainOfflineLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDcdnDomainOfflineLogDeliveryRequest self = new EnableDcdnDomainOfflineLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableDcdnDomainOfflineLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableDcdnDomainOfflineLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
