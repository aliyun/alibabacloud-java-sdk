// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcBlacklistRequest extends TeaModel {
    @NameInMap("Blacklist")
    public String blacklist;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteAutoCcBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcBlacklistRequest self = new DeleteAutoCcBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcBlacklistRequest setBlacklist(String blacklist) {
        this.blacklist = blacklist;
        return this;
    }
    public String getBlacklist() {
        return this.blacklist;
    }

    public DeleteAutoCcBlacklistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
