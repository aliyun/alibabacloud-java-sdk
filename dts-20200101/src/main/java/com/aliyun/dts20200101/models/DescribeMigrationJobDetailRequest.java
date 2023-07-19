// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailRequest extends TeaModel {
    @NameInMap("MigrationMode")
    public DescribeMigrationJobDetailRequestMigrationMode migrationMode;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data migration instance. You can call the **DescribeMigrationJobs** operation to query the instance ID.</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public static class DescribeMigrationJobDetailRequestMigrationMode extends TeaModel {
        /**
         * <p>Specifies whether to query the details of full data migration. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <br>
         * <p>*   **false**: no</p>
         * <br>
         * <p>> Default value: **false**</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Specifies whether to query the details of incremental data migration. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <br>
         * <p>*   **false**: no</p>
         * <br>
         * <p>> Default value: **false**</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Specifies whether to query the details of schema migration. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <br>
         * <p>*   **false**: no</p>
         * <br>
         * <p>> Default value: **false**</p>
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
