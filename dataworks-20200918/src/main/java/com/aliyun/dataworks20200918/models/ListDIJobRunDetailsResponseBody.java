// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIJobRunDetailsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDIJobRunDetailsResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDIJobRunDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobRunDetailsResponseBody self = new ListDIJobRunDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIJobRunDetailsResponseBody setPagingInfo(ListDIJobRunDetailsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDIJobRunDetailsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDIJobRunDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos extends TeaModel {
        @NameInMap("DestinationDatabaseName")
        public String destinationDatabaseName;

        @NameInMap("DestinationDatasourceName")
        public String destinationDatasourceName;

        @NameInMap("DestinationSchemaName")
        public String destinationSchemaName;

        @NameInMap("DestinationTableName")
        public String destinationTableName;

        @NameInMap("FullMigrationErrorMessage")
        public String fullMigrationErrorMessage;

        @NameInMap("FullMigrationStatus")
        public String fullMigrationStatus;

        @NameInMap("OfflineErrorRecords")
        public Long offlineErrorRecords;

        @NameInMap("OfflineTotalBytes")
        public Long offlineTotalBytes;

        @NameInMap("OfflineTotalRecords")
        public Long offlineTotalRecords;

        @NameInMap("RealtimeMigrationErrorMessage")
        public String realtimeMigrationErrorMessage;

        @NameInMap("RealtimeMigrationStatus")
        public String realtimeMigrationStatus;

        @NameInMap("SourceDatabaseName")
        public String sourceDatabaseName;

        @NameInMap("SourceDatasourceName")
        public String sourceDatasourceName;

        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("StructureMigrationErrorMessage")
        public String structureMigrationErrorMessage;

        @NameInMap("StructureMigrationStatus")
        public String structureMigrationStatus;

        public static ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos self = new ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos();
            return TeaModel.build(map, self);
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setDestinationDatabaseName(String destinationDatabaseName) {
            this.destinationDatabaseName = destinationDatabaseName;
            return this;
        }
        public String getDestinationDatabaseName() {
            return this.destinationDatabaseName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setDestinationDatasourceName(String destinationDatasourceName) {
            this.destinationDatasourceName = destinationDatasourceName;
            return this;
        }
        public String getDestinationDatasourceName() {
            return this.destinationDatasourceName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setDestinationSchemaName(String destinationSchemaName) {
            this.destinationSchemaName = destinationSchemaName;
            return this;
        }
        public String getDestinationSchemaName() {
            return this.destinationSchemaName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setDestinationTableName(String destinationTableName) {
            this.destinationTableName = destinationTableName;
            return this;
        }
        public String getDestinationTableName() {
            return this.destinationTableName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setFullMigrationErrorMessage(String fullMigrationErrorMessage) {
            this.fullMigrationErrorMessage = fullMigrationErrorMessage;
            return this;
        }
        public String getFullMigrationErrorMessage() {
            return this.fullMigrationErrorMessage;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setFullMigrationStatus(String fullMigrationStatus) {
            this.fullMigrationStatus = fullMigrationStatus;
            return this;
        }
        public String getFullMigrationStatus() {
            return this.fullMigrationStatus;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setOfflineErrorRecords(Long offlineErrorRecords) {
            this.offlineErrorRecords = offlineErrorRecords;
            return this;
        }
        public Long getOfflineErrorRecords() {
            return this.offlineErrorRecords;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setOfflineTotalBytes(Long offlineTotalBytes) {
            this.offlineTotalBytes = offlineTotalBytes;
            return this;
        }
        public Long getOfflineTotalBytes() {
            return this.offlineTotalBytes;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setOfflineTotalRecords(Long offlineTotalRecords) {
            this.offlineTotalRecords = offlineTotalRecords;
            return this;
        }
        public Long getOfflineTotalRecords() {
            return this.offlineTotalRecords;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setRealtimeMigrationErrorMessage(String realtimeMigrationErrorMessage) {
            this.realtimeMigrationErrorMessage = realtimeMigrationErrorMessage;
            return this;
        }
        public String getRealtimeMigrationErrorMessage() {
            return this.realtimeMigrationErrorMessage;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setRealtimeMigrationStatus(String realtimeMigrationStatus) {
            this.realtimeMigrationStatus = realtimeMigrationStatus;
            return this;
        }
        public String getRealtimeMigrationStatus() {
            return this.realtimeMigrationStatus;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = sourceDatabaseName;
            return this;
        }
        public String getSourceDatabaseName() {
            return this.sourceDatabaseName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setSourceDatasourceName(String sourceDatasourceName) {
            this.sourceDatasourceName = sourceDatasourceName;
            return this;
        }
        public String getSourceDatasourceName() {
            return this.sourceDatasourceName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setSourceSchemaName(String sourceSchemaName) {
            this.sourceSchemaName = sourceSchemaName;
            return this;
        }
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setStructureMigrationErrorMessage(String structureMigrationErrorMessage) {
            this.structureMigrationErrorMessage = structureMigrationErrorMessage;
            return this;
        }
        public String getStructureMigrationErrorMessage() {
            return this.structureMigrationErrorMessage;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos setStructureMigrationStatus(String structureMigrationStatus) {
            this.structureMigrationStatus = structureMigrationStatus;
            return this;
        }
        public String getStructureMigrationStatus() {
            return this.structureMigrationStatus;
        }

    }

    public static class ListDIJobRunDetailsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("JobRunInfos")
        public java.util.List<ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos> jobRunInfos;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDIJobRunDetailsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobRunDetailsResponseBodyPagingInfo self = new ListDIJobRunDetailsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDIJobRunDetailsResponseBodyPagingInfo setJobRunInfos(java.util.List<ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos> jobRunInfos) {
            this.jobRunInfos = jobRunInfos;
            return this;
        }
        public java.util.List<ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos> getJobRunInfos() {
            return this.jobRunInfos;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDIJobRunDetailsResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
