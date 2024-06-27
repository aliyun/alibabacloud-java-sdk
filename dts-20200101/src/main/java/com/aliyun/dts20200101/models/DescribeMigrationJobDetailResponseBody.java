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
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of data migration instances that can be displayed on one page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AE3CD0B-4148-426F-A90E-952467CC****</p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if full data migration failed.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The number of records that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("FinishRowNum")
        public String finishRowNum;

        /**
         * <p>The time taken by full data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("MigrationTime")
        public String migrationTime;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of full data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Full data migration is not started.</li>
         * <li><strong>Migrating</strong>: Full data migration is in progress.</li>
         * <li><strong>Failed</strong>: Full data migration failed.</li>
         * <li><strong>Finished</strong>: Full data migration is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of records that are supposed to be migrated by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>201477</p>
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
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
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
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of incremental data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Incremental data migration is not started.</li>
         * <li><strong>Migrating</strong>: Incremental data migration is in progress.</li>
         * <li><strong>Failed</strong>: Incremental data migration failed.</li>
         * <li><strong>Finished</strong>: Incremental data migration is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
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
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if constraints failed to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist；</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The syntax to create constraints.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE SEQUENCE &quot;public&quot;.&quot;collections_id_seq&quot;   MINVALUE 1   MAXVALUE 9223372036854775807   START 249   INCREMENT BY 1 ;</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of migration object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the migration object. The value is <strong>Table</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of constraint creation. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong></li>
         * <li><strong>Migrating</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Finished</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
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
         * <blockquote>
         * <p> This parameter is returned only if the <strong>ObjectType</strong> parameter is set to <strong>Table</strong> and the migration object has constraints.</p>
         * </blockquote>
         */
        @NameInMap("ConstraintList")
        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList constraintList;

        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if schema migration failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: DTS-1020042 Execute sql error sql: ERROR: column \&quot;id\&quot; named in key does not exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The schema of the migration object.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code>  int(10) unsigned   auto_increment  COMMENT \&quot;\&quot;   NOT NULL   , \n<code>runoob_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>runoob_author1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT \&quot;\&quot;   NULL   \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = \&quot;\&quot; ;\n</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of migration object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the migration object. Valid values: <strong>Table</strong>, <strong>Constraint</strong>, <strong>Index</strong>, <strong>View</strong>, <strong>Materialize View</strong>, <strong>Type</strong>, <strong>Synonym</strong>, <strong>Trigger</strong>, <strong>Function</strong>, <strong>Procedure</strong>, <strong>Package</strong>, <strong>Default</strong>, <strong>Rule</strong>, <strong>PlanGuide</strong>, and <strong>Sequence</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of schema migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Schema migration is not started.</li>
         * <li><strong>Migrating</strong>: Schema migration is in progress.</li>
         * <li><strong>Failed</strong>: Schema migration failed.</li>
         * <li><strong>Finished</strong>: Schema migration is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
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
