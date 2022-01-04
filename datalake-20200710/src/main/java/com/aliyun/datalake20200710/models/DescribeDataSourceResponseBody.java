// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSource")
    public DescribeDataSourceResponseBodyDataSource dataSource;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceResponseBody self = new DescribeDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceResponseBody setDataSource(DescribeDataSourceResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public DescribeDataSourceResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public DescribeDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataSourceResponseBodyDataSource extends TeaModel {
        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        public static DescribeDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceResponseBodyDataSource self = new DescribeDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceResponseBodyDataSource setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public DescribeDataSourceResponseBodyDataSource setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribeDataSourceResponseBodyDataSource setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public DescribeDataSourceResponseBodyDataSource setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataSourceResponseBodyDataSource setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
