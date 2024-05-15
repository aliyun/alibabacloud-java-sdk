// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMongoDBCurrentOpRequest extends TeaModel {
    /**
     * <p>The `db.currentOp()` command that is used to filter sessions. For more information, see [db.currentOp()](https://docs.mongodb.com/manual/reference/method/db.currentOp/) of MongoDB Documentation.</p>
     */
    @NameInMap("FilterDoc")
    public String filterDoc;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  If you do not specify a node ID, the sessions of the primary node are queried by default.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>A reserved parameter. You do not need to specify the parameter.</p>
     */
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
