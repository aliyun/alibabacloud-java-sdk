// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailResponseBody extends TeaModel {
    /**
     * <p>The details of full data migration.</p>
     */
    @NameInMap("DataInitializationDetailList")
    public DescribeMigrationJobDetailResponseBodyDataInitializationDetailList dataInitializationDetailList;

    /**
     * <p>The details of incremental data migration.</p>
     */
    @NameInMap("DataSynchronizationDetailList")
    public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList dataSynchronizationDetailList;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of data migration instances that can be displayed on one page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of schema migration.</p>
     */
    @NameInMap("StructureInitializationDetailList")
    public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList structureInitializationDetailList;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries that are returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeMigrationJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobDetailResponseBody self = new DescribeMigrationJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobDetailResponseBody setDataInitializationDetailList(DescribeMigrationJobDetailResponseBodyDataInitializationDetailList dataInitializationDetailList) {
        this.dataInitializationDetailList = dataInitializationDetailList;
        return this;
    }
    public DescribeMigrationJobDetailResponseBodyDataInitializationDetailList getDataInitializationDetailList() {
        return this.dataInitializationDetailList;
    }

    public DescribeMigrationJobDetailResponseBody setDataSynchronizationDetailList(DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList dataSynchronizationDetailList) {
        this.dataSynchronizationDetailList = dataSynchronizationDetailList;
        return this;
    }
    public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList getDataSynchronizationDetailList() {
        return this.dataSynchronizationDetailList;
    }

    public DescribeMigrationJobDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMigrationJobDetailResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationJobDetailResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrationJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobDetailResponseBody setStructureInitializationDetailList(DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList structureInitializationDetailList) {
        this.structureInitializationDetailList = structureInitializationDetailList;
        return this;
    }
    public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList getStructureInitializationDetailList() {
        return this.structureInitializationDetailList;
    }

    public DescribeMigrationJobDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeMigrationJobDetailResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if full data migration failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The number of records that have been migrated.</p>
         */
        @NameInMap("FinishRowNum")
        public String finishRowNum;

        /**
         * <p>The time taken by full data migration.</p>
         */
        @NameInMap("MigrationTime")
        public String migrationTime;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of full data migration. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: Full data migration is not started.</p>
         * <p>- **Migrating**: Full data migration is in progress.</p>
         * <p>- **Failed**: Full data migration failed.</p>
         * <p>- **Finished**: Full data migration is completed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of records that are supposed to be migrated by the task.</p>
         */
        @NameInMap("TotalRowNum")
        public String totalRowNum;

        public static DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail self = new DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setFinishRowNum(String finishRowNum) {
            this.finishRowNum = finishRowNum;
            return this;
        }
        public String getFinishRowNum() {
            return this.finishRowNum;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setMigrationTime(String migrationTime) {
            this.migrationTime = migrationTime;
            return this;
        }
        public String getMigrationTime() {
            return this.migrationTime;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setTotalRowNum(String totalRowNum) {
            this.totalRowNum = totalRowNum;
            return this;
        }
        public String getTotalRowNum() {
            return this.totalRowNum;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyDataInitializationDetailList extends TeaModel {
        @NameInMap("DataInitializationDetail")
        public java.util.List<DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail> dataInitializationDetail;

        public static DescribeMigrationJobDetailResponseBodyDataInitializationDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataInitializationDetailList self = new DescribeMigrationJobDetailResponseBodyDataInitializationDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailList setDataInitializationDetail(java.util.List<DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail> dataInitializationDetail) {
            this.dataInitializationDetail = dataInitializationDetail;
            return this;
        }
        public java.util.List<DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail> getDataInitializationDetail() {
            return this.dataInitializationDetail;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if incremental data migration failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of incremental data migration. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: Incremental data migration is not started.</p>
         * <p>*   **Migrating**: Incremental data migration is in progress.</p>
         * <p>*   **Failed**: Incremental data migration failed.</p>
         * <p>*   **Finished**: Incremental data migration is completed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail self = new DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList extends TeaModel {
        @NameInMap("DataSynchronizationDetail")
        public java.util.List<DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail> dataSynchronizationDetail;

        public static DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList self = new DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList setDataSynchronizationDetail(java.util.List<DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail> dataSynchronizationDetail) {
            this.dataSynchronizationDetail = dataSynchronizationDetail;
            return this;
        }
        public java.util.List<DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail> getDataSynchronizationDetail() {
            return this.dataSynchronizationDetail;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if constraints failed to be created.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The syntax to create constraints.</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of migration object.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the migration object. The value is **Table**.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of constraint creation. Valid values:</p>
         * <br>
         * <p>- **NotStarted**</p>
         * <p>- **Migrating**</p>
         * <p>- **Failed**</p>
         * <p>- **Finished**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList extends TeaModel {
        @NameInMap("StructureInitializationDetail")
        public java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail> structureInitializationDetail;

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList setStructureInitializationDetail(java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail> structureInitializationDetail) {
            this.structureInitializationDetail = structureInitializationDetail;
            return this;
        }
        public java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail extends TeaModel {
        /**
         * <p>The constraints of the migration object, such as indexes and foreign keys. </p>
         * <br>
         * <p>>  This parameter is returned only if the **ObjectType** parameter is set to **Table** and the migration object has constraints.</p>
         */
        @NameInMap("ConstraintList")
        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList constraintList;

        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if schema migration failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The schema of the migration object.</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of migration object.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the migration object. Valid values: **Table**, **Constraint**, **Index**, **View**, **Materialize View**, **Type**, **Synonym**, **Trigger**, **Function**, **Procedure**, **Package**, **Default**, **Rule**, **PlanGuide**, and **Sequence**.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of schema migration. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: Schema migration is not started.</p>
         * <p>- **Migrating**: Schema migration is in progress.</p>
         * <p>- **Failed**: Schema migration failed.</p>
         * <p>- **Finished**: Schema migration is completed.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setConstraintList(DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList constraintList) {
            this.constraintList = constraintList;
            return this;
        }
        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList getConstraintList() {
            return this.constraintList;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList extends TeaModel {
        @NameInMap("StructureInitializationDetail")
        public java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail;

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList setStructureInitializationDetail(java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail) {
            this.structureInitializationDetail = structureInitializationDetail;
            return this;
        }
        public java.util.List<DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

    }

}
