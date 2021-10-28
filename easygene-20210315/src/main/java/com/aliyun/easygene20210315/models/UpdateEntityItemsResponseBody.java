// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityItemsResponseBody extends TeaModel {
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

    public static UpdateEntityItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityItemsResponseBody self = new UpdateEntityItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEntityItemsResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityItemsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public UpdateEntityItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEntityItemsResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
