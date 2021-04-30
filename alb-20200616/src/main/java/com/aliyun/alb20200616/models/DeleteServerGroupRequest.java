// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteServerGroupRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 服务器组id
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    // 是否DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DeleteServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerGroupRequest self = new DeleteServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public DeleteServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
