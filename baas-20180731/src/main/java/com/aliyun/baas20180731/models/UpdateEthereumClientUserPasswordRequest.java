// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumClientUserPasswordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static UpdateEthereumClientUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumClientUserPasswordRequest self = new UpdateEthereumClientUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumClientUserPasswordRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateEthereumClientUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateEthereumClientUserPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
