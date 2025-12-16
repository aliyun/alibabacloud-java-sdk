// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultsRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Replication")
    public Boolean replication;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-*********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the backup vault. Valid values:</p>
     * <ul>
     * <li><strong>UNKNOWN</strong>: The backup vault is in an unknown state.</li>
     * <li><strong>INITIALIZING</strong>: The backup vault is being initialized.</li>
     * <li><strong>CREATED</strong>: The backup vault is created.</li>
     * <li><strong>ERROR</strong>: An error occurs on the backup vault.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Tag information. Supports up to 20 tags.</p>
     * 
     * <strong>example:</strong>
     * <p>6a745bceffb042959b3b5206d6f12ad1</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVaultsRequestTag> tag;

    /**
     * <p>Backup vault ID.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    /**
     * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>vaultname</p>
     */
    @NameInMap("VaultName")
    public String vaultName;

    @NameInMap("VaultOwnerId")
    public Long vaultOwnerId;

    /**
     * <p>The region ID to which the backup vault belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    /**
     * <p>Backup repository type. The values are as follows: </p>
     * <ul>
     * <li><strong>STANDARD</strong>: Represents a standard repository, which can be used for ECS file backups, OSS backups, NAS backups, etc. </li>
     * <li><strong>OTS_BACKUP</strong>: Represents a TableStore repository, which is only used for TableStore backups, and TableStore must use this type of repository.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VaultType")
    public String vaultType;

    public static DescribeVaultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultsRequest self = new DescribeVaultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVaultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVaultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVaultsRequest setReplication(Boolean replication) {
        this.replication = replication;
        return this;
    }
    public Boolean getReplication() {
        return this.replication;
    }

    public DescribeVaultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVaultsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVaultsRequest setTag(java.util.List<DescribeVaultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVaultsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVaultsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public DescribeVaultsRequest setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }
    public String getVaultName() {
        return this.vaultName;
    }

    public DescribeVaultsRequest setVaultOwnerId(Long vaultOwnerId) {
        this.vaultOwnerId = vaultOwnerId;
        return this;
    }
    public Long getVaultOwnerId() {
        return this.vaultOwnerId;
    }

    public DescribeVaultsRequest setVaultRegionId(String vaultRegionId) {
        this.vaultRegionId = vaultRegionId;
        return this;
    }
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    public DescribeVaultsRequest setVaultType(String vaultType) {
        this.vaultType = vaultType;
        return this;
    }
    public String getVaultType() {
        return this.vaultType;
    }

    public static class DescribeVaultsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The Value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVaultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsRequestTag self = new DescribeVaultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVaultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
