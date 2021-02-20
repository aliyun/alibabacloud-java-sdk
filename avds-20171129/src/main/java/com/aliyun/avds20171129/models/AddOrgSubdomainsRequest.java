// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgSubdomainsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Subdomains")
    public java.util.List<String> subdomains;

    public static AddOrgSubdomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrgSubdomainsRequest self = new AddOrgSubdomainsRequest();
        return TeaModel.build(map, self);
    }

    public AddOrgSubdomainsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddOrgSubdomainsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public AddOrgSubdomainsRequest setSubdomains(java.util.List<String> subdomains) {
        this.subdomains = subdomains;
        return this;
    }
    public java.util.List<String> getSubdomains() {
        return this.subdomains;
    }

}
