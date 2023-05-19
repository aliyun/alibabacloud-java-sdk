// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDCdnDomainSchdmByPropertyRequest extends TeaModel {
    /**
     * <p>The name of the accelerated domain for which you want to change the acceleration region. You can specify only one domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The region where the acceleration service is deployed. Valid values:</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **overseas**: outside the Chinese mainland</p>
     * <p>*   **global**: global</p>
     */
    @NameInMap("Property")
    public String property;

    public static ModifyDCdnDomainSchdmByPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDCdnDomainSchdmByPropertyRequest self = new ModifyDCdnDomainSchdmByPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDCdnDomainSchdmByPropertyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyDCdnDomainSchdmByPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

}
