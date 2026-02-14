// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDataCenterTableResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataCenterTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterTableResponseBody self = new ListDataCenterTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCenterTableResponseBody setData(ListDataCenterTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataCenterTableResponseBodyData getData() {
        return this.data;
    }

    public ListDataCenterTableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataCenterTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataCenterTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCenterTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataCenterTableResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>diamonds.csv</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("DescUpdateTime")
        public String descUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>69950353</p>
         */
        @NameInMap("DmsDbId")
        public Long dmsDbId;

        /**
         * <strong>example:</strong>
         * <p>2310246</p>
         */
        @NameInMap("DmsInstanceId")
        public Long dmsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("ImportType")
        public String importType;

        /**
         * <strong>example:</strong>
         * <p>f-ean8u5881qk4*********xh5y</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TableDesc")
        public String tableDesc;

        /**
         * <strong>example:</strong>
         * <p>xa8wib4ga3a2*********fjbx</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <strong>example:</strong>
         * <p>diamonds</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListDataCenterTableResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDataCenterTableResponseBodyDataContent self = new ListDataCenterTableResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDataCenterTableResponseBodyDataContent setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListDataCenterTableResponseBodyDataContent setDescUpdateTime(String descUpdateTime) {
            this.descUpdateTime = descUpdateTime;
            return this;
        }
        public String getDescUpdateTime() {
            return this.descUpdateTime;
        }

        public ListDataCenterTableResponseBodyDataContent setDmsDbId(Long dmsDbId) {
            this.dmsDbId = dmsDbId;
            return this;
        }
        public Long getDmsDbId() {
            return this.dmsDbId;
        }

        public ListDataCenterTableResponseBodyDataContent setDmsInstanceId(Long dmsInstanceId) {
            this.dmsInstanceId = dmsInstanceId;
            return this;
        }
        public Long getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        public ListDataCenterTableResponseBodyDataContent setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListDataCenterTableResponseBodyDataContent setImportType(String importType) {
            this.importType = importType;
            return this;
        }
        public String getImportType() {
            return this.importType;
        }

        public ListDataCenterTableResponseBodyDataContent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListDataCenterTableResponseBodyDataContent setTableDesc(String tableDesc) {
            this.tableDesc = tableDesc;
            return this;
        }
        public String getTableDesc() {
            return this.tableDesc;
        }

        public ListDataCenterTableResponseBodyDataContent setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListDataCenterTableResponseBodyDataContent setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataCenterTableResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListDataCenterTableResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListDataCenterTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCenterTableResponseBodyData self = new ListDataCenterTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCenterTableResponseBodyData setContent(java.util.List<ListDataCenterTableResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDataCenterTableResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDataCenterTableResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataCenterTableResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataCenterTableResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDataCenterTableResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
