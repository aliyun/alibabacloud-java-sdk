// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaDatabasesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about SAP HANA databases.</p>
     */
    @NameInMap("HanaDatabases")
    public DescribeHanaDatabasesResponseBodyHanaDatabases hanaDatabases;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHanaDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaDatabasesResponseBody self = new DescribeHanaDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaDatabasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaDatabasesResponseBody setHanaDatabases(DescribeHanaDatabasesResponseBodyHanaDatabases hanaDatabases) {
        this.hanaDatabases = hanaDatabases;
        return this;
    }
    public DescribeHanaDatabasesResponseBodyHanaDatabases getHanaDatabases() {
        return this.hanaDatabases;
    }

    public DescribeHanaDatabasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaDatabasesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaDatabasesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHanaDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase extends TeaModel {
        /**
         * <p>Indicates whether the database is started. Valid values:</p>
         * <br>
         * <p>*   **YES**: The database is started.</p>
         * <p>*   **NO**: The database is not started.</p>
         */
        @NameInMap("ActiveStatus")
        public String activeStatus;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The detailed information.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The hostname.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("SqlPort")
        public Integer sqlPort;

        public static DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase self = new DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setActiveStatus(String activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }
        public String getActiveStatus() {
            return this.activeStatus;
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase setSqlPort(Integer sqlPort) {
            this.sqlPort = sqlPort;
            return this;
        }
        public Integer getSqlPort() {
            return this.sqlPort;
        }

    }

    public static class DescribeHanaDatabasesResponseBodyHanaDatabases extends TeaModel {
        @NameInMap("HanaDatabase")
        public java.util.List<DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase> hanaDatabase;

        public static DescribeHanaDatabasesResponseBodyHanaDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaDatabasesResponseBodyHanaDatabases self = new DescribeHanaDatabasesResponseBodyHanaDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeHanaDatabasesResponseBodyHanaDatabases setHanaDatabase(java.util.List<DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase> hanaDatabase) {
            this.hanaDatabase = hanaDatabase;
            return this;
        }
        public java.util.List<DescribeHanaDatabasesResponseBodyHanaDatabasesHanaDatabase> getHanaDatabase() {
            return this.hanaDatabase;
        }

    }

}
