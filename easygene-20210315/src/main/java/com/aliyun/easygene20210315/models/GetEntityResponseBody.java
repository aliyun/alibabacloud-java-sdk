// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetEntityResponseBody extends TeaModel {
    @NameInMap("Attributes")
    public java.util.List<String> attributes;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Workspace")
    public String workspace;

    public static GetEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityResponseBody self = new GetEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityResponseBody setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<String> getAttributes() {
        return this.attributes;
    }

    public GetEntityResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntityResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetEntityResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
