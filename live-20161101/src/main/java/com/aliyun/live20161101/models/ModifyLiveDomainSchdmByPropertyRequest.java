// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveDomainSchdmByPropertyRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Property")
    @Validation(required = true)
    public String property;

    public static ModifyLiveDomainSchdmByPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveDomainSchdmByPropertyRequest self = new ModifyLiveDomainSchdmByPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveDomainSchdmByPropertyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyLiveDomainSchdmByPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

}
