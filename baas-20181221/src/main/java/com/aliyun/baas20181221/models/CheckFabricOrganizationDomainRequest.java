// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricOrganizationDomainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    public static CheckFabricOrganizationDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricOrganizationDomainRequest self = new CheckFabricOrganizationDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckFabricOrganizationDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CheckFabricOrganizationDomainRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
