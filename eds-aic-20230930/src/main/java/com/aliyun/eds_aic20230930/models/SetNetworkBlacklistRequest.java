// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetNetworkBlacklistRequest extends TeaModel {
    @NameInMap("DomainBlacklist")
    public java.util.List<String> domainBlacklist;

    @NameInMap("IpBlacklist")
    public java.util.List<String> ipBlacklist;

    public static SetNetworkBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        SetNetworkBlacklistRequest self = new SetNetworkBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public SetNetworkBlacklistRequest setDomainBlacklist(java.util.List<String> domainBlacklist) {
        this.domainBlacklist = domainBlacklist;
        return this;
    }
    public java.util.List<String> getDomainBlacklist() {
        return this.domainBlacklist;
    }

    public SetNetworkBlacklistRequest setIpBlacklist(java.util.List<String> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<String> getIpBlacklist() {
        return this.ipBlacklist;
    }

}
