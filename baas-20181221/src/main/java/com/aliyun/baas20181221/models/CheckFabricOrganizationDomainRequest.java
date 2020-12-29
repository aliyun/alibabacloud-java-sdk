// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricOrganizationDomainRequest extends TeaModel {
    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Domain")
    public String domain;

    public static CheckFabricOrganizationDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricOrganizationDomainRequest self = new CheckFabricOrganizationDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckFabricOrganizationDomainRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CheckFabricOrganizationDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
