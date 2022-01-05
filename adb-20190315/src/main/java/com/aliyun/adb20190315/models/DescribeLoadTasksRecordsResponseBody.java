// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoadTasksRecordsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("LoadTasksRecords")
    public java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> loadTasksRecords;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeLoadTasksRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadTasksRecordsResponseBody self = new DescribeLoadTasksRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadTasksRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeLoadTasksRecordsResponseBody setLoadTasksRecords(java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> loadTasksRecords) {
        this.loadTasksRecords = loadTasksRecords;
        return this;
    }
    public java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> getLoadTasksRecords() {
        return this.loadTasksRecords;
    }

    public DescribeLoadTasksRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadTasksRecordsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadTasksRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadTasksRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadTasksRecordsResponseBodyLoadTasksRecords extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ProcessID")
        public String processID;

        @NameInMap("ProcessRows")
        public Long processRows;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeLoadTasksRecordsResponseBodyLoadTasksRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadTasksRecordsResponseBodyLoadTasksRecords self = new DescribeLoadTasksRecordsResponseBodyLoadTasksRecords();
            return TeaModel.build(map, self);
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setProcessID(String processID) {
            this.processID = processID;
            return this;
        }
        public String getProcessID() {
            return this.processID;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setProcessRows(Long processRows) {
            this.processRows = processRows;
            return this;
        }
        public Long getProcessRows() {
            return this.processRows;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
