// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class DeleteServerGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtoptyui****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

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

    public DeleteServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
