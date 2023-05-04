// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ModifyCdnDomainSchdmByProperty**.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The accelerated region. Valid values for coverage:</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **overseas**: global (excluding the Chinese mainland)</p>
     * <p>*   **global**: global</p>
     */
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

    public ModifyCdnDomainSchdmByPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

}
