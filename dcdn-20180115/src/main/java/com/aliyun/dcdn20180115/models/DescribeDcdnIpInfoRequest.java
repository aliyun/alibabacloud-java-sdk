// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpInfoRequest extends TeaModel {
    @NameInMap("IP")
    public String IP;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDcdnIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpInfoRequest self = new DescribeDcdnIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpInfoRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public DescribeDcdnIpInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnIpInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
