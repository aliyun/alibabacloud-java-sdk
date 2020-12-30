// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainGreenManagerConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Enable")
    public String enable;

    public static SetDomainGreenManagerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainGreenManagerConfigRequest self = new SetDomainGreenManagerConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainGreenManagerConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDomainGreenManagerConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainGreenManagerConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

}
