// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ReleaseNodePrivateNetworkAddressRequest extends TeaModel {
    /**
     * <p>The type of the public endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>SRV</strong></p>
     * </li>
     * <li><p><strong>Normal</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when the endpoint to be released is an SRV endpoint.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SRV</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The ID of the sharded cluster instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1a7009eb24****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the internal endpoint for the node. Valid values:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: virtual private cloud.</p>
     * </li>
     * <li><p><strong>Classic</strong>: classic network.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/62135.html">DescribeShardingNetworkAddress</a> API to query the network type of the internal endpoint for the node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The ID of the shard or Configserver node.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> API to query the ID of the shard or Configserver node.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>When you release an SRV address, enter the instance ID for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp128a003436****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ReleaseNodePrivateNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseNodePrivateNetworkAddressRequest self = new ReleaseNodePrivateNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseNodePrivateNetworkAddressRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public ReleaseNodePrivateNetworkAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ReleaseNodePrivateNetworkAddressRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseNodePrivateNetworkAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseNodePrivateNetworkAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseNodePrivateNetworkAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
