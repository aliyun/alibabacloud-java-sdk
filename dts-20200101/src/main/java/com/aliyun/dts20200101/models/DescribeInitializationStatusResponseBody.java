// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeInitializationStatusResponseBody extends TeaModel {
    /**
     * <p>The details of initial full data synchronization.</p>
     */
    @NameInMap("DataInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataInitializationDetails> dataInitializationDetails;

    /**
     * <p>The details of incremental data synchronization.</p>
     * <br>
     * <p>>  This parameter and the parameters it contains will be removed in the future.</p>
     */
    @NameInMap("DataSynchronizationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataSynchronizationDetails> dataSynchronizationDetails;

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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of initial schema synchronization.</p>
     */
    @NameInMap("StructureInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> structureInitializationDetails;

    /**
     * <p>Indicates whether the call was successful.</p>
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
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if initial full data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The total number of rows that are actually synchronized.</p>
         * <br>
         * <p>>  This parameter indicates the total number of actually synchronized rows. In contrast, the value of the **TotalRowNum** parameter is calculated based on the system tables in the source database. The values of the two parameters may be different due to time difference.</p>
         */
        @NameInMap("FinishRowNum")
        public String finishRowNum;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of initial full data synchronization. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**</p>
         * <p>*   **Migrating**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Finished**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of rows that are supposed to be synchronized.</p>
         * <br>
         * <p>>  The value of this parameter is calculated based on the system tables in the source database. In contrast, the **FinishRowNum** parameter indicates the total number of actually synchronized rows. The values of the two parameters may be different due to time difference.</p>
         */
        @NameInMap("TotalRowNum")
        public String totalRowNum;

        /**
         * <p>The time spent on full data synchronization.</p>
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
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if incremental data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of incremental data synchronization. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**</p>
         * <p>*   **Migrating**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Finished**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
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
         * <p>The name of the database to which the object in the destination instance belongs.</p>
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
         * <p>The name of the object.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the object. Valid value: **Table**.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of constraint creation. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**</p>
         * <p>*   **Migrating**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Finished**</p>
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
         * <br>
         * <p>>  This parameter is returned only if the **ObjectType** parameter is set to **Table** and the synchronization object has constraints.</p>
         */
        @NameInMap("Constraints")
        public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> constraints;

        /**
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         */
        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        /**
         * <p>The error message returned if initial schema synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The schema of the object.</p>
         */
        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The type of the object. Valid values:</p>
         * <br>
         * <p>**Table**, **Constraint**, **Index**, **View**, **Materialize View**, **Type**, **Synonym**, **Trigger**, **Function**, **Procedure**, **Package**, **Default**, **Rule**, **PlanGuide**, and **Sequence**.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        /**
         * <p>The status of initial schema synchronization. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**</p>
         * <p>*   **Migrating**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Finished**</p>
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
