// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRangeConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetRangeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRangeConfigRequest self = new SetRangeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetRangeConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetRangeConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetRangeConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetRangeConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
