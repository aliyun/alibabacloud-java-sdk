// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBResourcePoolRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of nodes.</p>
     * <br>
     * <p>*   Each node provides 16 cores and 64 GB memory.</p>
     * <p>*   The amount of resources that you want to add to or remove from the cluster cannot exceed the total amount of resources in the cluster.</p>
     * <br>
     * <p>> - If you do not specify this parameter, the original value is retained.</p>
     * <p>> - You must specify at least one of the QueryType and NodeNum parameters.</p>
     */
    @NameInMap("NodeNum")
    public Integer nodeNum;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the resource group.</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    /**
     * <p>The mode in which SQL statements are executed. Valid values:</p>
     * <br>
     * <p>*   **batch**</p>
     * <p>*   **interactive**</p>
     * <br>
     * <p>> If you do not specify this parameter, the original value is retained.</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBResourcePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourcePoolRequest self = new ModifyDBResourcePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourcePoolRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBResourcePoolRequest setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public ModifyDBResourcePoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBResourcePoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBResourcePoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public ModifyDBResourcePoolRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ModifyDBResourcePoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBResourcePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
