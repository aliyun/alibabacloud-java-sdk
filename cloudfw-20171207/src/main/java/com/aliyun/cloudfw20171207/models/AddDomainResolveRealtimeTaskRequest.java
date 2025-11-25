// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDomainResolveRealtimeTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static AddDomainResolveRealtimeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResolveRealtimeTaskRequest self = new AddDomainResolveRealtimeTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainResolveRealtimeTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainResolveRealtimeTaskRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public AddDomainResolveRealtimeTaskRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
