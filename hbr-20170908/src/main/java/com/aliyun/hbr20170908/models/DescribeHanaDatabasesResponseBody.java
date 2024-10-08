// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaDatabasesResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about SAP HANA databases.</p>
     */
    @NameInMap("HanaDatabases")
    public DescribeHanaDatabasesResponseBodyHanaDatabases hanaDatabases;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DAAB6A29-34EB-5F56-962F-D5BDBFE8A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <ul>
         * <li><strong>YES</strong>: The database is started.</li>
         * <li><strong>NO</strong>: The database is not started.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("ActiveStatus")
        public String activeStatus;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEMDB</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>izbp1jbf3zy******antqmz</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>indexserver</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>30013</p>
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
