// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyRequest extends TeaModel {
    // The accelerated domain name for which you want to change the accelerated region. You can specify only one domain name.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The accelerated region. Valid values for coverage:
    // 
    // *   **domestic**: Chinese mainland
    // *   **overseas**: global (excluding the Chinese mainland)
    // *   **global**: global
    @NameInMap("Property")
    public String property;

    public static ModifyCdnDomainSchdmByPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainSchdmByPropertyRequest self = new ModifyCdnDomainSchdmByPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainSchdmByPropertyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyCdnDomainSchdmByPropertyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCdnDomainSchdmByPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

}
