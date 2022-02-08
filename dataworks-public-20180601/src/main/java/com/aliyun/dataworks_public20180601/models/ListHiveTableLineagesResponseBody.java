// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListHiveTableLineagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListHiveTableLineagesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHiveTableLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHiveTableLineagesResponseBody self = new ListHiveTableLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHiveTableLineagesResponseBody setData(ListHiveTableLineagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHiveTableLineagesResponseBodyData getData() {
        return this.data;
    }

    public ListHiveTableLineagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListHiveTableLineagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListHiveTableLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHiveTableLineagesResponseBodyDataDownstreamLineages extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("QueryText")
        public String queryText;

        @NameInMap("Source")
        public String source;

        @NameInMap("TableName")
        public String tableName;

        public static ListHiveTableLineagesResponseBodyDataDownstreamLineages build(java.util.Map<String, ?> map) throws Exception {
            ListHiveTableLineagesResponseBodyDataDownstreamLineages self = new ListHiveTableLineagesResponseBodyDataDownstreamLineages();
            return TeaModel.build(map, self);
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setQueryText(String queryText) {
            this.queryText = queryText;
            return this;
        }
        public String getQueryText() {
            return this.queryText;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHiveTableLineagesResponseBodyDataDownstreamLineages setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListHiveTableLineagesResponseBodyDataUpstreamLineages extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("QueryText")
        public String queryText;

        @NameInMap("Source")
        public String source;

        @NameInMap("TableName")
        public String tableName;

        public static ListHiveTableLineagesResponseBodyDataUpstreamLineages build(java.util.Map<String, ?> map) throws Exception {
            ListHiveTableLineagesResponseBodyDataUpstreamLineages self = new ListHiveTableLineagesResponseBodyDataUpstreamLineages();
            return TeaModel.build(map, self);
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setQueryText(String queryText) {
            this.queryText = queryText;
            return this;
        }
        public String getQueryText() {
            return this.queryText;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHiveTableLineagesResponseBodyDataUpstreamLineages setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListHiveTableLineagesResponseBodyData extends TeaModel {
        @NameInMap("DownstreamLineages")
        public java.util.List<ListHiveTableLineagesResponseBodyDataDownstreamLineages> downstreamLineages;

        @NameInMap("DownstreamNumber")
        public Integer downstreamNumber;

        @NameInMap("UpstreamLineages")
        public java.util.List<ListHiveTableLineagesResponseBodyDataUpstreamLineages> upstreamLineages;

        @NameInMap("UpstreamNumber")
        public Integer upstreamNumber;

        public static ListHiveTableLineagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHiveTableLineagesResponseBodyData self = new ListHiveTableLineagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHiveTableLineagesResponseBodyData setDownstreamLineages(java.util.List<ListHiveTableLineagesResponseBodyDataDownstreamLineages> downstreamLineages) {
            this.downstreamLineages = downstreamLineages;
            return this;
        }
        public java.util.List<ListHiveTableLineagesResponseBodyDataDownstreamLineages> getDownstreamLineages() {
            return this.downstreamLineages;
        }

        public ListHiveTableLineagesResponseBodyData setDownstreamNumber(Integer downstreamNumber) {
            this.downstreamNumber = downstreamNumber;
            return this;
        }
        public Integer getDownstreamNumber() {
            return this.downstreamNumber;
        }

        public ListHiveTableLineagesResponseBodyData setUpstreamLineages(java.util.List<ListHiveTableLineagesResponseBodyDataUpstreamLineages> upstreamLineages) {
            this.upstreamLineages = upstreamLineages;
            return this;
        }
        public java.util.List<ListHiveTableLineagesResponseBodyDataUpstreamLineages> getUpstreamLineages() {
            return this.upstreamLineages;
        }

        public ListHiveTableLineagesResponseBodyData setUpstreamNumber(Integer upstreamNumber) {
            this.upstreamNumber = upstreamNumber;
            return this;
        }
        public Integer getUpstreamNumber() {
            return this.upstreamNumber;
        }

    }

}
