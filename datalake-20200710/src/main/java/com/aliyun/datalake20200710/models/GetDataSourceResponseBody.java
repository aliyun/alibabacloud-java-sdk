// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSource")
    public GetDataSourceResponseBodyDataSource dataSource;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceResponseBody self = new GetDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceResponseBody setDataSource(GetDataSourceResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public GetDataSourceResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public GetDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceResponseBodyDataSource extends TeaModel {
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

        public static GetDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceResponseBodyDataSource self = new GetDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetDataSourceResponseBodyDataSource setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public GetDataSourceResponseBodyDataSource setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDataSourceResponseBodyDataSource setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public GetDataSourceResponseBodyDataSource setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataSourceResponseBodyDataSource setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
