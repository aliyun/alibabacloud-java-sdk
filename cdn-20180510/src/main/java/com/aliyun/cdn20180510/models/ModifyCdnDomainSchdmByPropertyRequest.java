// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to change the acceleration region. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The information about the acceleration region. {&quot;coverage&quot;:&quot;overseas&quot;}</p>
     * <p>Valid values for coverage:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: global (excluding the Chinese mainland)</li>
     * <li><strong>global</strong>: global</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;coverage&quot;:&quot;overseas&quot;}</p>
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
