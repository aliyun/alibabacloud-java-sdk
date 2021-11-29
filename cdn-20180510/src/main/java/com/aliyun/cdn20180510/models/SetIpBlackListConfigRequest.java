// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpBlackListConfigRequest extends TeaModel {
    @NameInMap("BlockIps")
    public String blockIps;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetIpBlackListConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpBlackListConfigRequest self = new SetIpBlackListConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetIpBlackListConfigRequest setBlockIps(String blockIps) {
        this.blockIps = blockIps;
        return this;
    }
    public String getBlockIps() {
        return this.blockIps;
    }

    public SetIpBlackListConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetIpBlackListConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetIpBlackListConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
