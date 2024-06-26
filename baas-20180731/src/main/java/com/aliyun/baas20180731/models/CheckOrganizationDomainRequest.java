// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckOrganizationDomainRequest extends TeaModel {
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

    public static CheckOrganizationDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationDomainRequest self = new CheckOrganizationDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CheckOrganizationDomainRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
