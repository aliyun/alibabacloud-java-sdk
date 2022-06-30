// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcWhitelistRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Whitelist")
    public String whitelist;

    public static DeleteAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcWhitelistRequest self = new DeleteAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAutoCcWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
