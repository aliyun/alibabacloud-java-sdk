// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailRequest extends TeaModel {
    @NameInMap("MigrationMode")
    public DescribeMigrationJobDetailRequestMigrationMode migrationMode;

    /**
     * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong> and does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsta7w132u12h****</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong> and does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 30, 50, and 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see List of supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to query the details of schema migration. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes</p>
     * </li>
     * <li><p><strong>false</strong>: no</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>false</strong></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeMigrationJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobDetailRequest self = new DescribeMigrationJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobDetailRequest setMigrationMode(DescribeMigrationJobDetailRequestMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public DescribeMigrationJobDetailRequestMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public DescribeMigrationJobDetailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMigrationJobDetailRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMigrationJobDetailRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DescribeMigrationJobDetailRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationJobDetailRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeMigrationJobDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationJobDetailRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class DescribeMigrationJobDetailRequestMigrationMode extends TeaModel {
        /**
         * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>When you call this operation, the data migration task must be in the Migrating, Failed, Paused, or Finished state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeMigrationJobDetailRequestMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailRequestMigrationMode self = new DescribeMigrationJobDetailRequestMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailRequestMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeMigrationJobDetailRequestMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeMigrationJobDetailRequestMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

}
