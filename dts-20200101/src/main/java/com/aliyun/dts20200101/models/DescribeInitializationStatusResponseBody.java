// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeInitializationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("DataInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataInitializationDetails> dataInitializationDetails;

    @NameInMap("DataSynchronizationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyDataSynchronizationDetails> dataSynchronizationDetails;

    @NameInMap("StructureInitializationDetails")
    public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> structureInitializationDetails;

    public static DescribeInitializationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitializationStatusResponseBody self = new DescribeInitializationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInitializationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInitializationStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInitializationStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeInitializationStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
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

    public DescribeInitializationStatusResponseBody setStructureInitializationDetails(java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> structureInitializationDetails) {
        this.structureInitializationDetails = structureInitializationDetails;
        return this;
    }
    public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetails> getStructureInitializationDetails() {
        return this.structureInitializationDetails;
    }

    public static class DescribeInitializationStatusResponseBodyDataInitializationDetails extends TeaModel {
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UsedTime")
        public String usedTime;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FinishRowNum")
        public String finishRowNum;

        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        @NameInMap("TotalRowNum")
        public String totalRowNum;

        public static DescribeInitializationStatusResponseBodyDataInitializationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyDataInitializationDetails self = new DescribeInitializationStatusResponseBodyDataInitializationDetails();
            return TeaModel.build(map, self);
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

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setUsedTime(String usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public String getUsedTime() {
            return this.usedTime;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataInitializationDetails setTotalRowNum(String totalRowNum) {
            this.totalRowNum = totalRowNum;
            return this;
        }
        public String getTotalRowNum() {
            return this.totalRowNum;
        }

    }

    public static class DescribeInitializationStatusResponseBodyDataSynchronizationDetails extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        public static DescribeInitializationStatusResponseBodyDataSynchronizationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyDataSynchronizationDetails self = new DescribeInitializationStatusResponseBodyDataSynchronizationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyDataSynchronizationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

    }

    public static class DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        @NameInMap("ObjectName")
        public String objectName;

        public static DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints self = new DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class DescribeInitializationStatusResponseBodyStructureInitializationDetails extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        @NameInMap("ObjectDefinition")
        public String objectDefinition;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("Constraints")
        public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> constraints;

        public static DescribeInitializationStatusResponseBodyStructureInitializationDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInitializationStatusResponseBodyStructureInitializationDetails self = new DescribeInitializationStatusResponseBodyStructureInitializationDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeInitializationStatusResponseBodyStructureInitializationDetails setConstraints(java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> constraints) {
            this.constraints = constraints;
            return this;
        }
        public java.util.List<DescribeInitializationStatusResponseBodyStructureInitializationDetailsConstraints> getConstraints() {
            return this.constraints;
        }

    }

}
