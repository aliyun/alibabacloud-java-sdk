// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeInitializationStatusResponseBody extends TeaModel {
    /**
     * <p>The details of full data initialization.</p>
     */
    @NameInMap("DataInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataInitializationDetails> dataInitializationDetails;

    /**
     * <p>The details of incremental data synchronization.</p>
     * <blockquote>
     * <p>This parameter set and the included response parameters will be discontinued.</p>
     * </blockquote>
     */
    @NameInMap("DataSynchronizationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataSynchronizationDetails> dataSynchronizationDetails;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>150DECD9-13FF-4929-A5DE-855BE9CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of schema initialization.</p>
     */
    @NameInMap("StructureInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> structureInitializationDetails;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeInitializationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitializationStatusResponseBody self = new DescribeInitializationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInitializationStatusResponseBody setDataInitializationDetails(java.util.List<DescribeInitializationStatusResponseBodyDataInitializationDetails> dataInitializationDetails) {
        this.dataInitializationDetails = dataInitializationDetails;
        return this;
    }
    public java.util.List<DescribeInitializationStatusResponseBodyDataInitializationDetails> getDataInitializationDetails() {
        return this.dataInitializationDetails;
    }

    public DescribeInitializationStatusResponseBody setDataSynchronizationDetails(java.util.List<DescribeInitializationStatusResponseBodyDataSynchronizationDetails> dataSynchronizationDetails) {
        this.dataSynchronizationDetails = dataSynchronizationDetails;
        return this;
    }
    public java.util.List<DescribeInitializationStatusResponseBodyDataSynchronizationDetails> getDataSynchronizationDetails() {
        return this.dataSynchronizationDetails;
    }

    public DescribeInitializationStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInitializationStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeInitializationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInitializationStatusResponseBody setStructureInitializationDetails(java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> structureInitializationDetails) {
        this.structureInitializationDetails = structureInitializationDetails;
        return this;
    }
    public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> getStructureInitializationDetails() {
        return this.structureInitializationDetails;
    }

    public DescribeInitializationStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeInitializationStatusResponseBodyDataInitializationDetails extends TeaModel {
        /**
         * <p>The name of the database to which the objects to be synchronized belong in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned when full data initialization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The number of rows that have been synchronized.</p>
         * <blockquote>
         * <p>This parameter indicates the total number of rows that are actually synchronized. The value of the <strong>TotalRowNum</strong> parameter is obtained from the system table of the source database before synchronization starts. Due to time differences during synchronization, the two values may differ.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9993</p>
         */
        @NameInMap("FinishRowNum")
        public String finishRowNum;

        /**
         * <p>The name of the database to which the objects to be synchronized belong in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of full data initialization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Not started.</li>
         * <li><strong>Migrating</strong>: In progress.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Finished</strong>: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name of the synchronization object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of rows to be synchronized.</p>
         * <blockquote>
         * <p>The value of this parameter is obtained from the system table of the source database before synchronization starts. The <strong>FinishRowNum</strong> parameter indicates the total number of rows that are actually synchronized. Due to time differences during synchronization, the two values may differ.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9981</p>
         */
        @NameInMap("TotalRowNum")
        public String totalRowNum;

        /**
         * <p>The time consumed by full data initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("UsedTime")
        public String usedTime;

        public static DescribeInitializationStatusResponseBodyDataInitializationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyDataInitializationDetails self = new DescribeInitializationStatusResponseBodyDataInitializationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setFinishRowNum(String finishRowNum) {
            this.finishRowNum = finishRowNum;
            return this;
        }
        public String getFinishRowNum() {
            return this.finishRowNum;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setTotalRowNum(String totalRowNum) {
            this.totalRowNum = totalRowNum;
            return this;
        }
        public String getTotalRowNum() {
            return this.totalRowNum;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setUsedTime(String usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public String getUsedTime() {
            return this.usedTime;
        }

    }

    public static class DescribeInitializationStatusResponseBodyDataSynchronizationDetails extends TeaModel {
        /**
         * <p>The name of the database to which the objects to be synchronized belong in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned when incremental data synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>任务失败太久无法恢复</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the database to which the objects to be synchronized belong in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of incremental data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Not started.</li>
         * <li><strong>Migrating</strong>: In progress.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Finished</strong>: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name of the synchronization object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeInitializationStatusResponseBodyDataSynchronizationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyDataSynchronizationDetails self = new DescribeInitializationStatusResponseBodyDataSynchronizationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints extends TeaModel {
        /**
         * <p>The name of the database to which the objects to be synchronized belong in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned when constraint creation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The syntax definition for creating the constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE SEQUENCE &quot;public&quot;.&quot;collections_id_seq&quot;   MINVALUE 1   MAXVALUE 9223372036854775807   START 249   INCREMENT BY 1 ;</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of the synchronization object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the synchronization object. The value is fixed as <strong>Table</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the objects to be synchronized belong in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of constraint creation. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Not started.</li>
         * <li><strong>Migrating</strong>: In progress.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Finished</strong>: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints self = new DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInitializationStatusResponseBodyStructureInitializationDetails extends TeaModel {
        /**
         * <p>The constraints of the synchronization object, such as indexes and foreign keys.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>ObjectType</strong> is set to <strong>Table</strong> and the synchronization object has constraints.</p>
         * </blockquote>
         */
        @NameInMap("Constraints")
        public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> constraints;

        /**
         * <p>The name of the database to which the objects to be synchronized belong in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned when schema initialization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: Table \&quot;customer\&quot; already exists</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The syntax definition of the synchronization object.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>customer_id</code>  int(10) unsigned   auto_increment  COMMENT \&quot;\&quot;   NOT NULL   , \n<code>customer_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>customer_company1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT \&quot;\&quot;   NULL   \n, PRIMARY KEY (<code>customer_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = \&quot;\&quot; ;\n</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of the synchronization object.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the synchronization object. Valid values:
         * <strong>Table</strong>, <strong>Constraint</strong>, <strong>Index</strong>, <strong>View</strong>, <strong>Materialize View</strong>, <strong>Type</strong>, <strong>Synonym</strong>, <strong>Trigger</strong>, <strong>Function</strong>, <strong>Procedure</strong>, <strong>Package</strong>, <strong>Default</strong>, <strong>Rule</strong>, <strong>PlanGuide</strong>, and <strong>Sequence</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the objects to be synchronized belong in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of schema initialization. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Not started.</li>
         * <li><strong>Migrating</strong>: In progress.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Finished</strong>: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInitializationStatusResponseBodyStructureInitializationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyStructureInitializationDetails self = new DescribeInitializationStatusResponseBodyStructureInitializationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setConstraints(java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> constraints) {
            this.constraints = constraints;
            return this;
        }
        public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> getConstraints() {
            return this.constraints;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
