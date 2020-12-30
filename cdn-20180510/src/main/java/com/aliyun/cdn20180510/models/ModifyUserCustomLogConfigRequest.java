// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyUserCustomLogConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("Tag")
    public String tag;

    public static ModifyUserCustomLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserCustomLogConfigRequest self = new ModifyUserCustomLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserCustomLogConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUserCustomLogConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ModifyUserCustomLogConfigRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
