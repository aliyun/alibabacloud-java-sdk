// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class GetDBListFromAgentRequest extends TeaModel {
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetDBListFromAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBListFromAgentRequest self = new GetDBListFromAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetDBListFromAgentRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public GetDBListFromAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetDBListFromAgentRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetDBListFromAgentRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public GetDBListFromAgentRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
