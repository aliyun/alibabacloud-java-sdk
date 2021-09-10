// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportConnectionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Connections")
    public String connections;

    public static ImportConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportConnectionsRequest self = new ImportConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ImportConnectionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ImportConnectionsRequest setConnections(String connections) {
        this.connections = connections;
        return this;
    }
    public String getConnections() {
        return this.connections;
    }

}
