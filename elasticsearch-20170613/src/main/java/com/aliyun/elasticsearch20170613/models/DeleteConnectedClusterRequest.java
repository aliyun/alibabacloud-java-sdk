// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteConnectedClusterRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("connectedInstanceId")
    public String connectedInstanceId;

    public static DeleteConnectedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectedClusterRequest self = new DeleteConnectedClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectedClusterRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
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
