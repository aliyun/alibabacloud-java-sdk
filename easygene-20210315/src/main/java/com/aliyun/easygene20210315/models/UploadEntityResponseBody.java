// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UploadEntityResponseBody extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Workspace")
    public String workspace;

    public static UploadEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadEntityResponseBody self = new UploadEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadEntityResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UploadEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public UploadEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadEntityResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
