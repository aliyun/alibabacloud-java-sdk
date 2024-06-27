// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeJDBCDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the service. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql data source config</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>hdfs_pxf</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>Init</li>
     * <li>Running</li>
     * <li>Exception</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DataSourceStatus")
    public String dataSourceStatus;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The JDBC connection string.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCConnectionString")
    public String JDBCConnectionString;

    /**
     * <p>The password of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCPassword")
    public String JDBCPassword;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCUserName")
    public String JDBCUserName;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
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
