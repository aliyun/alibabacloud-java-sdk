// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMongoDBCurrentOpRequest extends TeaModel {
    @NameInMap("FilterDoc")
    public String filterDoc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Role")
    public String role;

    public static GetMongoDBCurrentOpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMongoDBCurrentOpRequest self = new GetMongoDBCurrentOpRequest();
        return TeaModel.build(map, self);
    }

    public GetMongoDBCurrentOpRequest setFilterDoc(String filterDoc) {
        this.filterDoc = filterDoc;
        return this;
    }
    public String getFilterDoc() {
        return this.filterDoc;
    }

    public GetMongoDBCurrentOpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMongoDBCurrentOpRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetMongoDBCurrentOpRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
