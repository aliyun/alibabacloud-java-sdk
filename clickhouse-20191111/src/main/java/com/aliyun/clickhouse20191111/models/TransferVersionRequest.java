// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionRequest extends TeaModel {
    /**
     * <p>The ID of the source cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1tm8zf130ew****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The time windows during which writes are disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-08T00:00:00+08:00,2025-02-12T00:00:00+08:00</p>
     */
    @NameInMap("DisableWriteWindows")
    public String disableWriteWindows;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (Default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. Call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceAccount")
    public String sourceAccount;

    /**
     * <p>The name of the self-managed ClickHouse cluster.
     * To obtain the name, execute <code>SELECT * FROM system.clusters</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SourceClusterName")
    public String sourceClusterName;

    /**
     * <p>The password of the source account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("SourcePassword")
    public String sourcePassword;

    /**
     * <p>The addresses and TCP ports of the shards in the self-managed ClickHouse cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.4:9000,192.168.0.5:9000,192.168.0.6:9000</p>
     */
    @NameInMap("SourceShards")
    public String sourceShards;

    /**
     * <p>The destination account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TargetAccount")
    public String targetAccount;

    /**
     * <p>The ID of the destination cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp14b39djx7zg****</p>
     */
    @NameInMap("TargetDbClusterId")
    public String targetDbClusterId;

    /**
     * <p>The password of the destination account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Ff</p>
     */
    @NameInMap("TargetPassword")
    public String targetPassword;

    public static TransferVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferVersionRequest self = new TransferVersionRequest();
        return TeaModel.build(map, self);
    }

    public TransferVersionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TransferVersionRequest setDisableWriteWindows(String disableWriteWindows) {
        this.disableWriteWindows = disableWriteWindows;
        return this;
    }
    public String getDisableWriteWindows() {
        return this.disableWriteWindows;
    }

    public TransferVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TransferVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TransferVersionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public TransferVersionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TransferVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransferVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TransferVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TransferVersionRequest setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public TransferVersionRequest setSourceClusterName(String sourceClusterName) {
        this.sourceClusterName = sourceClusterName;
        return this;
    }
    public String getSourceClusterName() {
        return this.sourceClusterName;
    }

    public TransferVersionRequest setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
        return this;
    }
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    public TransferVersionRequest setSourceShards(String sourceShards) {
        this.sourceShards = sourceShards;
        return this;
    }
    public String getSourceShards() {
        return this.sourceShards;
    }

    public TransferVersionRequest setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
        return this;
    }
    public String getTargetAccount() {
        return this.targetAccount;
    }

    public TransferVersionRequest setTargetDbClusterId(String targetDbClusterId) {
        this.targetDbClusterId = targetDbClusterId;
        return this;
    }
    public String getTargetDbClusterId() {
        return this.targetDbClusterId;
    }

    public TransferVersionRequest setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }
    public String getTargetPassword() {
        return this.targetPassword;
    }

}
