// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourcePoolRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of nodes. Default value: 0.</p>
     * <ul>
     * <li>Each node provides 16 cores and 64 GB memory.</li>
     * <li>The total amount of resources provided by the nodes (number of nodes × 16 cores, number of nodes × 64 GB memory) cannot exceed the total amount of resources in the cluster. Set this parameter to a proper value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeNum")
    public Integer nodeNum;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the resource group.</p>
     * <ul>
     * <li>The name can be up to 255 characters in length.</li>
     * <li>The name must start with a letter or a digit.</li>
     * <li>The name can contain letters, digits, hyphens (<em>), and underscores (</em>).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    /**
     * <p>The mode in which to execute SQL statements.</p>
     * <ul>
     * <li><p><strong>batch</strong></p>
     * </li>
     * <li><p><strong>interactive</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>interactive</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDBResourcePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourcePoolRequest self = new CreateDBResourcePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBResourcePoolRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBResourcePoolRequest setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public CreateDBResourcePoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBResourcePoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBResourcePoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public CreateDBResourcePoolRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public CreateDBResourcePoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBResourcePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
