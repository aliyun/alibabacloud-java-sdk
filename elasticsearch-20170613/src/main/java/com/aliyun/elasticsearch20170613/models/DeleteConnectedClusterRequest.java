// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteConnectedClusterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The instance ID of the remote instance that is connected over the network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-09k1rgid9000g****</p>
     */
    @NameInMap("connectedInstanceId")
    public String connectedInstanceId;

    public static DeleteConnectedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectedClusterRequest self = new DeleteConnectedClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectedClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteConnectedClusterRequest setConnectedInstanceId(String connectedInstanceId) {
        this.connectedInstanceId = connectedInstanceId;
        return this;
    }
    public String getConnectedInstanceId() {
        return this.connectedInstanceId;
    }

}
