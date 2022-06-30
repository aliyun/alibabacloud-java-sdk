// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Whitelist")
    public String whitelist;

    public static AddAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcWhitelistRequest self = new AddAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddAutoCcWhitelistRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public AddAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddAutoCcWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
