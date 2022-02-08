// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListHiveColumnLineagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListHiveColumnLineagesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHiveColumnLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHiveColumnLineagesResponseBody self = new ListHiveColumnLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHiveColumnLineagesResponseBody setData(ListHiveColumnLineagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHiveColumnLineagesResponseBodyData getData() {
        return this.data;
    }

    public ListHiveColumnLineagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListHiveColumnLineagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListHiveColumnLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHiveColumnLineagesResponseBodyDataDownstreamLineages extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DirectDownColumnNumber")
        public Integer directDownColumnNumber;

        @NameInMap("DirectDownTableNumber")
        public Integer directDownTableNumber;

        @NameInMap("DirectUpperColumnNumber")
        public Integer directUpperColumnNumber;

        @NameInMap("DirectUpperTableNumber")
        public Integer directUpperTableNumber;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("TableName")
        public String tableName;

        public static ListHiveColumnLineagesResponseBodyDataDownstreamLineages build(java.util.Map<String, ?> map) throws Exception {
            ListHiveColumnLineagesResponseBodyDataDownstreamLineages self = new ListHiveColumnLineagesResponseBodyDataDownstreamLineages();
            return TeaModel.build(map, self);
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setDirectDownColumnNumber(Integer directDownColumnNumber) {
            this.directDownColumnNumber = directDownColumnNumber;
            return this;
        }
        public Integer getDirectDownColumnNumber() {
            return this.directDownColumnNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setDirectDownTableNumber(Integer directDownTableNumber) {
            this.directDownTableNumber = directDownTableNumber;
            return this;
        }
        public Integer getDirectDownTableNumber() {
            return this.directDownTableNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setDirectUpperColumnNumber(Integer directUpperColumnNumber) {
            this.directUpperColumnNumber = directUpperColumnNumber;
            return this;
        }
        public Integer getDirectUpperColumnNumber() {
            return this.directUpperColumnNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setDirectUpperTableNumber(Integer directUpperTableNumber) {
            this.directUpperTableNumber = directUpperTableNumber;
            return this;
        }
        public Integer getDirectUpperTableNumber() {
            return this.directUpperTableNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHiveColumnLineagesResponseBodyDataDownstreamLineages setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListHiveColumnLineagesResponseBodyDataUpstreamLineages extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DirectDownColumnNumber")
        public Integer directDownColumnNumber;

        @NameInMap("DirectDownTableNumber")
        public Integer directDownTableNumber;

        @NameInMap("DirectUpperColumnNumber")
        public Integer directUpperColumnNumber;

        @NameInMap("DirectUpperTableNumber")
        public Integer directUpperTableNumber;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("TableName")
        public String tableName;

        public static ListHiveColumnLineagesResponseBodyDataUpstreamLineages build(java.util.Map<String, ?> map) throws Exception {
            ListHiveColumnLineagesResponseBodyDataUpstreamLineages self = new ListHiveColumnLineagesResponseBodyDataUpstreamLineages();
            return TeaModel.build(map, self);
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setDirectDownColumnNumber(Integer directDownColumnNumber) {
            this.directDownColumnNumber = directDownColumnNumber;
            return this;
        }
        public Integer getDirectDownColumnNumber() {
            return this.directDownColumnNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setDirectDownTableNumber(Integer directDownTableNumber) {
            this.directDownTableNumber = directDownTableNumber;
            return this;
        }
        public Integer getDirectDownTableNumber() {
            return this.directDownTableNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setDirectUpperColumnNumber(Integer directUpperColumnNumber) {
            this.directUpperColumnNumber = directUpperColumnNumber;
            return this;
        }
        public Integer getDirectUpperColumnNumber() {
            return this.directUpperColumnNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setDirectUpperTableNumber(Integer directUpperTableNumber) {
            this.directUpperTableNumber = directUpperTableNumber;
            return this;
        }
        public Integer getDirectUpperTableNumber() {
            return this.directUpperTableNumber;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHiveColumnLineagesResponseBodyDataUpstreamLineages setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListHiveColumnLineagesResponseBodyData extends TeaModel {
        @NameInMap("DownstreamLineages")
        public java.util.List<ListHiveColumnLineagesResponseBodyDataDownstreamLineages> downstreamLineages;

        @NameInMap("DownstreamNumber")
        public Integer downstreamNumber;

        @NameInMap("UpstreamLineages")
        public java.util.List<ListHiveColumnLineagesResponseBodyDataUpstreamLineages> upstreamLineages;

        @NameInMap("UpstreamNumber")
        public Integer upstreamNumber;

        public static ListHiveColumnLineagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHiveColumnLineagesResponseBodyData self = new ListHiveColumnLineagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHiveColumnLineagesResponseBodyData setDownstreamLineages(java.util.List<ListHiveColumnLineagesResponseBodyDataDownstreamLineages> downstreamLineages) {
            this.downstreamLineages = downstreamLineages;
            return this;
        }
        public java.util.List<ListHiveColumnLineagesResponseBodyDataDownstreamLineages> getDownstreamLineages() {
            return this.downstreamLineages;
        }

        public ListHiveColumnLineagesResponseBodyData setDownstreamNumber(Integer downstreamNumber) {
            this.downstreamNumber = downstreamNumber;
            return this;
        }
        public Integer getDownstreamNumber() {
            return this.downstreamNumber;
        }

        public ListHiveColumnLineagesResponseBodyData setUpstreamLineages(java.util.List<ListHiveColumnLineagesResponseBodyDataUpstreamLineages> upstreamLineages) {
            this.upstreamLineages = upstreamLineages;
            return this;
        }
        public java.util.List<ListHiveColumnLineagesResponseBodyDataUpstreamLineages> getUpstreamLineages() {
            return this.upstreamLineages;
        }

        public ListHiveColumnLineagesResponseBodyData setUpstreamNumber(Integer upstreamNumber) {
            this.upstreamNumber = upstreamNumber;
            return this;
        }
        public Integer getUpstreamNumber() {
            return this.upstreamNumber;
        }

    }

}
