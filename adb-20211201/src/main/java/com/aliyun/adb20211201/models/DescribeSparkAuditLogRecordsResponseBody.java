// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAuditLogRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>amv-bp1j7******78j8i</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public java.util.List<DescribeSparkAuditLogRecordsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>2D5867CF-423F-559F-BBB1-199A289E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSparkAuditLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAuditLogRecordsResponseBody self = new DescribeSparkAuditLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAuditLogRecordsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSparkAuditLogRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkAuditLogRecordsResponseBody setItems(java.util.List<DescribeSparkAuditLogRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSparkAuditLogRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSparkAuditLogRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkAuditLogRecordsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkAuditLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkAuditLogRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSparkAuditLogRecordsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>s202411061011hzc5d6476000****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>notFoundIp</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>notFoundIpException</p>
         */
        @NameInMap("ErrorTrace")
        public String errorTrace;

        /**
         * <strong>example:</strong>
         * <p>2022-01-23T16:05:08Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InnerQueryId")
        public String innerQueryId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDiagnosable")
        public Boolean isDiagnosable;

        /**
         * <strong>example:</strong>
         * <p>999f2439-6b10-xxxx-a5d3-daf3b35c****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <strong>example:</strong>
         * <p>test_job</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM adb_hdfs_import_source</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>Statement ID。</p>
         * 
         * <strong>example:</strong>
         * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
         */
        @NameInMap("StatementId")
        public String statementId;

        /**
         * <strong>example:</strong>
         * <p>SQL_EDITOR</p>
         */
        @NameInMap("StatementSource")
        public String statementSource;

        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("TotalTime")
        public Long totalTime;

        /**
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeSparkAuditLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSparkAuditLogRecordsResponseBodyItems self = new DescribeSparkAuditLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setErrorTrace(String errorTrace) {
            this.errorTrace = errorTrace;
            return this;
        }
        public String getErrorTrace() {
            return this.errorTrace;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setInnerQueryId(String innerQueryId) {
            this.innerQueryId = innerQueryId;
            return this;
        }
        public String getInnerQueryId() {
            return this.innerQueryId;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setIsDiagnosable(Boolean isDiagnosable) {
            this.isDiagnosable = isDiagnosable;
            return this;
        }
        public Boolean getIsDiagnosable() {
            return this.isDiagnosable;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setStatementId(String statementId) {
            this.statementId = statementId;
            return this;
        }
        public String getStatementId() {
            return this.statementId;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setStatementSource(String statementSource) {
            this.statementSource = statementSource;
            return this;
        }
        public String getStatementSource() {
            return this.statementSource;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeSparkAuditLogRecordsResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
