// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DataInitializationDetailList")
    public DescribeMigrationJobDetailResponseBodyDataInitializationDetailList dataInitializationDetailList;

    @NameInMap("DataSynchronizationDetailList")
    public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailList dataSynchronizationDetailList;

    @NameInMap("StructureInitializationDetailList")
    public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList structureInitializationDetailList;

    public static DescribeMigrationJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobDetailResponseBody self = new DescribeMigrationJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobDetailResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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

    public DescribeMigrationJobDetailResponseBody setStructureInitializationDetailList(DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList structureInitializationDetailList) {
        this.structureInitializationDetailList = structureInitializationDetailList;
        return this;
    }
    public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailList getStructureInitializationDetailList() {
        return this.structureInitializationDetailList;
    }

    public static class DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail extends TeaModel {
        @NameInMap("SourceOwnerDBName")
        public String sourceOwnerDBName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FinishRowNum")
        public String finishRowNum;

        @NameInMap("MigrationTime")
        public String migrationTime;

        @NameInMap("DestinationOwnerDBName")
        public String destinationOwnerDBName;

        @NameInMap("TotalRowNum")
        public String totalRowNum;

        public static DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail self = new DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail();
            return TeaModel.build(map, self);
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

        public DescribeMigrationJobDetailResponseBodyDataInitializationDetailListDataInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
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

        public static DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail self = new DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyDataSynchronizationDetailListDataSynchronizationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
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

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintListStructureInitializationDetail setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
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

        @NameInMap("ConstraintList")
        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList constraintList;

        public static DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail self = new DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setSourceOwnerDBName(String sourceOwnerDBName) {
            this.sourceOwnerDBName = sourceOwnerDBName;
            return this;
        }
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectDefinition(String objectDefinition) {
            this.objectDefinition = objectDefinition;
            return this;
        }
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setDestinationOwnerDBName(String destinationOwnerDBName) {
            this.destinationOwnerDBName = destinationOwnerDBName;
            return this;
        }
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetail setConstraintList(DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList constraintList) {
            this.constraintList = constraintList;
            return this;
        }
        public DescribeMigrationJobDetailResponseBodyStructureInitializationDetailListStructureInitializationDetailConstraintList getConstraintList() {
            return this.constraintList;
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
