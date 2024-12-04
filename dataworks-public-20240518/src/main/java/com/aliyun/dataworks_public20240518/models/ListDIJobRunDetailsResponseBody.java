// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobRunDetailsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDIJobRunDetailsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
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
        /**
         * <p>The name of the database in the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_db</p>
         */
        @NameInMap("DestinationDatabaseName")
        public String destinationDatabaseName;

        /**
         * <p>The name of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_name</p>
         */
        @NameInMap("DestinationDatasourceName")
        public String destinationDatasourceName;

        /**
         * <p>The name of the schema of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_schema</p>
         */
        @NameInMap("DestinationSchemaName")
        public String destinationSchemaName;

        /**
         * <p>The name of the table in the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_name</p>
         */
        @NameInMap("DestinationTableName")
        public String destinationTableName;

        /**
         * <p>The error message that is returned if an error occurs during full batch synchronization. If no error occurs, no value is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>sync table t1 fail.</p>
         */
        @NameInMap("FullMigrationErrorMessage")
        public String fullMigrationErrorMessage;

        /**
         * <p>The status of full batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("FullMigrationStatus")
        public String fullMigrationStatus;

        /**
         * <p>The total number of errors that occur during full synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OfflineErrorRecords")
        public Long offlineErrorRecords;

        /**
         * <p>The total number of bytes that are synchronized during full synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OfflineTotalBytes")
        public Long offlineTotalBytes;

        /**
         * <p>The total number of data records that are synchronized during full synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OfflineTotalRecords")
        public Long offlineTotalRecords;

        /**
         * <p>The error message that is returned if an error occurs during real-time synchronization. If no error occurs, no value is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>sync table t1 fail.</p>
         */
        @NameInMap("RealtimeMigrationErrorMessage")
        public String realtimeMigrationErrorMessage;

        /**
         * <p>The status of real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("RealtimeMigrationStatus")
        public String realtimeMigrationStatus;

        /**
         * <p>The name of the database in the source.</p>
         * 
         * <strong>example:</strong>
         * <p>db_name</p>
         */
        @NameInMap("SourceDatabaseName")
        public String sourceDatabaseName;

        /**
         * <p>The name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_name</p>
         */
        @NameInMap("SourceDatasourceName")
        public String sourceDatasourceName;

        /**
         * <p>The name of the schema of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>schema_name</p>
         */
        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        /**
         * <p>The name of the table in the source.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        /**
         * <p>The error message that is returned if an error occurs during schema synchronization. If no error occurs, no value is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>create table t1 fail.</p>
         */
        @NameInMap("StructureMigrationErrorMessage")
        public String structureMigrationErrorMessage;

        /**
         * <p>The synchronization status of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
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
        /**
         * <p>The running information about the synchronization task.</p>
         */
        @NameInMap("JobRunInfos")
        public java.util.List<ListDIJobRunDetailsResponseBodyPagingInfoJobRunInfos> jobRunInfos;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
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
