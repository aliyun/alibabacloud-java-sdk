// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NewDnsServers")
    public java.util.List<String> newDnsServers;

    @NameInMap("OriginalDnsServers")
    public java.util.List<String> originalDnsServers;

    public static ModifyHichinaDomainDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSResponseBody self = new ModifyHichinaDomainDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHichinaDomainDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHichinaDomainDNSResponseBody setNewDnsServers(java.util.List<String> newDnsServers) {
        this.newDnsServers = newDnsServers;
        return this;
    }
    public java.util.List<String> getNewDnsServers() {
        return this.newDnsServers;
    }

    public ModifyHichinaDomainDNSResponseBody setOriginalDnsServers(java.util.List<String> originalDnsServers) {
        this.originalDnsServers = originalDnsServers;
        return this;
    }
    public java.util.List<String> getOriginalDnsServers() {
        return this.originalDnsServers;
    }

}
