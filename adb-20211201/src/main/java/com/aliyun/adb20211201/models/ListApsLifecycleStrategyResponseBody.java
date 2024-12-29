// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsLifecycleStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<ListApsLifecycleStrategyResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApsLifecycleStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApsLifecycleStrategyResponseBody self = new ListApsLifecycleStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApsLifecycleStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApsLifecycleStrategyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApsLifecycleStrategyResponseBody setItems(java.util.List<ListApsLifecycleStrategyResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListApsLifecycleStrategyResponseBodyItems> getItems() {
        return this.items;
    }

    public ListApsLifecycleStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApsLifecycleStrategyResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApsLifecycleStrategyResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApsLifecycleStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApsLifecycleStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApsLifecycleStrategyResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApsLifecycleStrategyResponseBodyItemsOperationTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProcessAll")
        public String processAll;

        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        public static ListApsLifecycleStrategyResponseBodyItemsOperationTables build(java.util.Map<String, ?> map) throws Exception {
            ListApsLifecycleStrategyResponseBodyItemsOperationTables self = new ListApsLifecycleStrategyResponseBodyItemsOperationTables();
            return TeaModel.build(map, self);
        }

        public ListApsLifecycleStrategyResponseBodyItemsOperationTables setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListApsLifecycleStrategyResponseBodyItemsOperationTables setProcessAll(String processAll) {
            this.processAll = processAll;
            return this;
        }
        public String getProcessAll() {
            return this.processAll;
        }

        public ListApsLifecycleStrategyResponseBodyItemsOperationTables setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

    }

    public static class ListApsLifecycleStrategyResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        @NameInMap("ApsJobId")
        public String apsJobId;

        /**
         * <strong>example:</strong>
         * <p>2021-06-30T02:44:27Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>2021-07-03T06:33:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OperationTables")
        public java.util.List<ListApsLifecycleStrategyResponseBodyItemsOperationTables> operationTables;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("StrategyDatabases")
        public Long strategyDatabases;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyDesc")
        public String strategyDesc;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("StrategyTables")
        public Long strategyTables;

        /**
         * <strong>example:</strong>
         * <p>KEEP_BY_TIME</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StrategyValue")
        public String strategyValue;

        public static ListApsLifecycleStrategyResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListApsLifecycleStrategyResponseBodyItems self = new ListApsLifecycleStrategyResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListApsLifecycleStrategyResponseBodyItems setApsJobId(String apsJobId) {
            this.apsJobId = apsJobId;
            return this;
        }
        public String getApsJobId() {
            return this.apsJobId;
        }

        public ListApsLifecycleStrategyResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListApsLifecycleStrategyResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListApsLifecycleStrategyResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListApsLifecycleStrategyResponseBodyItems setOperationTables(java.util.List<ListApsLifecycleStrategyResponseBodyItemsOperationTables> operationTables) {
            this.operationTables = operationTables;
            return this;
        }
        public java.util.List<ListApsLifecycleStrategyResponseBodyItemsOperationTables> getOperationTables() {
            return this.operationTables;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyDatabases(Long strategyDatabases) {
            this.strategyDatabases = strategyDatabases;
            return this;
        }
        public Long getStrategyDatabases() {
            return this.strategyDatabases;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyDesc(String strategyDesc) {
            this.strategyDesc = strategyDesc;
            return this;
        }
        public String getStrategyDesc() {
            return this.strategyDesc;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyTables(Long strategyTables) {
            this.strategyTables = strategyTables;
            return this;
        }
        public Long getStrategyTables() {
            return this.strategyTables;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ListApsLifecycleStrategyResponseBodyItems setStrategyValue(String strategyValue) {
            this.strategyValue = strategyValue;
            return this;
        }
        public String getStrategyValue() {
            return this.strategyValue;
        }

    }

}
