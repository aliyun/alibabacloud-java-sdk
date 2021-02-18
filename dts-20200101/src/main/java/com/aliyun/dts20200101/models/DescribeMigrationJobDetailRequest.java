// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailRequest extends TeaModel {
    @NameInMap("MigrationMode")
    public DescribeMigrationJobDetailRequestMigrationMode migrationMode;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

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

    public DescribeMigrationJobDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationJobDetailRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeMigrationJobDetailRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DescribeMigrationJobDetailRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMigrationJobDetailRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationJobDetailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public static class DescribeMigrationJobDetailRequestMigrationMode extends TeaModel {
        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        public static DescribeMigrationJobDetailRequestMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailRequestMigrationMode self = new DescribeMigrationJobDetailRequestMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailRequestMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
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

    }

}
