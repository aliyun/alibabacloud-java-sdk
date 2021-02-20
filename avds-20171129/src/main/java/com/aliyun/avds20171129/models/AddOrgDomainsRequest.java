// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgDomainsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static AddOrgDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrgDomainsRequest self = new AddOrgDomainsRequest();
        return TeaModel.build(map, self);
    }

    public AddOrgDomainsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddOrgDomainsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public AddOrgDomainsRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
