// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeJDBCDataSourceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceStatus")
    public String dataSourceStatus;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("JDBCConnectionString")
    public String JDBCConnectionString;

    @NameInMap("JDBCPassword")
    public String JDBCPassword;

    @NameInMap("JDBCUserName")
    public String JDBCUserName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusMessage")
    public String statusMessage;

    public static DescribeJDBCDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJDBCDataSourceResponseBody self = new DescribeJDBCDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJDBCDataSourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeJDBCDataSourceResponseBody setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public DescribeJDBCDataSourceResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeJDBCDataSourceResponseBody setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeJDBCDataSourceResponseBody setDataSourceStatus(String dataSourceStatus) {
        this.dataSourceStatus = dataSourceStatus;
        return this;
    }
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
    }

    public DescribeJDBCDataSourceResponseBody setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeJDBCDataSourceResponseBody setJDBCConnectionString(String JDBCConnectionString) {
        this.JDBCConnectionString = JDBCConnectionString;
        return this;
    }
    public String getJDBCConnectionString() {
        return this.JDBCConnectionString;
    }

    public DescribeJDBCDataSourceResponseBody setJDBCPassword(String JDBCPassword) {
        this.JDBCPassword = JDBCPassword;
        return this;
    }
    public String getJDBCPassword() {
        return this.JDBCPassword;
    }

    public DescribeJDBCDataSourceResponseBody setJDBCUserName(String JDBCUserName) {
        this.JDBCUserName = JDBCUserName;
        return this;
    }
    public String getJDBCUserName() {
        return this.JDBCUserName;
    }

    public DescribeJDBCDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJDBCDataSourceResponseBody setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }

}
