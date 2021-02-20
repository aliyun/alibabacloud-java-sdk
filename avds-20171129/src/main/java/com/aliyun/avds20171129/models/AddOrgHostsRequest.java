// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgHostsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Hosts")
    public java.util.List<String> hosts;

    public static AddOrgHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrgHostsRequest self = new AddOrgHostsRequest();
        return TeaModel.build(map, self);
    }

    public AddOrgHostsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddOrgHostsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public AddOrgHostsRequest setHosts(java.util.List<String> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<String> getHosts() {
        return this.hosts;
    }

}
