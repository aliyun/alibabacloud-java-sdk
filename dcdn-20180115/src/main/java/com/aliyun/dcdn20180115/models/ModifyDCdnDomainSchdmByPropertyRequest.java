// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDCdnDomainSchdmByPropertyRequest extends TeaModel {
    /**
     * <p>The name of the accelerated domain for which you want to change the acceleration region. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The region where the acceleration service is deployed. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: global (excluding mainland China)</li>
     * <li><strong>global</strong>: global</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;coverage&quot;:&quot;overseas&quot;}</p>
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
