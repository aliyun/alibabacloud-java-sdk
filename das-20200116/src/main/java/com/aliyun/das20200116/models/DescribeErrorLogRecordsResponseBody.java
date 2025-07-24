// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeErrorLogRecordsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAA17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeErrorLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsResponseBody self = new DescribeErrorLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeErrorLogRecordsResponseBody setData(DescribeErrorLogRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeErrorLogRecordsResponseBodyData getData() {
        return this.data;
    }

    public DescribeErrorLogRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeErrorLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeErrorLogRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeErrorLogRecordsResponseBodyDataLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NETWORK</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>conn18xxxxxx</p>
         */
        @NameInMap("ConnInfo")
        public String connInfo;

        /**
         * <strong>example:</strong>
         * <p>2025-07-15T15:14:27.175188+08:00 0 [Note] [MY-012468] [InnoDB] Transactions deadlock detected, dumping detailed information.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1731983067000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>d-bp128a003436****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static DescribeErrorLogRecordsResponseBodyDataLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsResponseBodyDataLogs self = new DescribeErrorLogRecordsResponseBodyDataLogs();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsResponseBodyDataLogs setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeErrorLogRecordsResponseBodyDataLogs setConnInfo(String connInfo) {
            this.connInfo = connInfo;
            return this;
        }
        public String getConnInfo() {
            return this.connInfo;
        }

        public DescribeErrorLogRecordsResponseBodyDataLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeErrorLogRecordsResponseBodyDataLogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeErrorLogRecordsResponseBodyDataLogs setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

    public static class DescribeErrorLogRecordsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-07-23T05:48:43Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsNumbers")
        public Long itemsNumbers;

        @NameInMap("Logs")
        public java.util.List<DescribeErrorLogRecordsResponseBodyDataLogs> logs;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumbers")
        public Integer pageNumbers;

        /**
         * <strong>example:</strong>
         * <p>2025-07-22T05:48:43Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRecords")
        public Long totalRecords;

        public static DescribeErrorLogRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsResponseBodyData self = new DescribeErrorLogRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeErrorLogRecordsResponseBodyData setItemsNumbers(Long itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        public DescribeErrorLogRecordsResponseBodyData setLogs(java.util.List<DescribeErrorLogRecordsResponseBodyDataLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeErrorLogRecordsResponseBodyDataLogs> getLogs() {
            return this.logs;
        }

        public DescribeErrorLogRecordsResponseBodyData setMaxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        public DescribeErrorLogRecordsResponseBodyData setPageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        public DescribeErrorLogRecordsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeErrorLogRecordsResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
