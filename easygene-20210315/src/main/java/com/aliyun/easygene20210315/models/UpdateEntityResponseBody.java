// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityResponseBody extends TeaModel {
    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityResponseBody self = new UpdateEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEntityResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public UpdateEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEntityResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
