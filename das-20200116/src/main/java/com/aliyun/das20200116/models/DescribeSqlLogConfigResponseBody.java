// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogConfigResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSqlLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogConfigResponseBody self = new DescribeSqlLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlLogConfigResponseBody setData(DescribeSqlLogConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlLogConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlLogConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlLogConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether cold data storage is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ColdEnable")
        public Boolean coldEnable;

        /**
         * <p>The cold data storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ColdRetention")
        public Integer coldRetention;

        /**
         * <p>The start time of cold data storage. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("ColdStartTime")
        public Long coldStartTime;

        /**
         * <p>The collector version. Valid values:</p>
         * <ul>
         * <li><strong>MYSQL_V0</strong>: MySQL V0.</li>
         * <li><strong>MYSQL_V1</strong>: MySQL V1.</li>
         * <li><strong>MYSQL_V2</strong>: MySQL V2.</li>
         * <li><strong>MYSQL_V3</strong>: MySQL V3.</li>
         * <li><strong>PG_V1</strong>: PostgreSQL V1.</li>
         * <li><strong>rdspg_v1</strong>: RDS PostgreSQL V1.</li>
         * <li><strong>polarpg_v1</strong>: PolarDB for PostgreSQL V1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MYSQL_V3</p>
         */
        @NameInMap("CollectorVersion")
        public String collectorVersion;

        /**
         * <p>Indicates whether SQL Explorer is enabled. This parameter is an alias of SqlLogEnable.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Indicates whether hot data storage is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HotEnable")
        public Boolean hotEnable;

        /**
         * <p>The hot data storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotRetention")
        public Integer hotRetention;

        /**
         * <p>The start time of hot data storage. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("HotStartTime")
        public Long hotStartTime;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("LogFilter")
        public String logFilter;

        /**
         * <p>Indicates whether SQL Explorer is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequestEnable")
        public Boolean requestEnable;

        /**
         * <p>The time when SQL Explorer was enabled. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("RequestStartTime")
        public Long requestStartTime;

        /**
         * <p>The expiration time of DAS Enterprise Edition V1. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715335200000</p>
         */
        @NameInMap("RequestStopTime")
        public Long requestStopTime;

        /**
         * <p>The total data storage duration, which is the sum of <strong>HotRetention</strong> and <strong>ColdRetention</strong>. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SqlLogEnable")
        public Boolean sqlLogEnable;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("SqlLogSource")
        public String sqlLogSource;

        /**
         * <p>The data migration status. Valid values:</p>
         * <ul>
         * <li><strong>FINISH</strong>: Historical data migration is complete.</li>
         * <li><strong>RUNNING</strong>: Historical data migration is in progress.</li>
         * <li><strong>FAILURE</strong>: Historical data migration failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("SqlLogState")
        public String sqlLogState;

        /**
         * <p>The time when DAS Enterprise Edition was enabled. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("SqlLogVisibleTime")
        public Long sqlLogVisibleTime;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("SupportMigration")
        public Boolean supportMigration;

        /**
         * <p>Indicates whether the engine and region of the current instance support security audit activation. This field only indicates product capability and does not indicate that security audit is already enabled.</p>
         */
        @NameInMap("SupportSecurityAudit")
        public Boolean supportSecurityAudit;

        /**
         * <p>The latest DAS Enterprise Edition version supported by the current instance. Valid values:</p>
         * <ul>
         * <li><strong>SQL_LOG_V0</strong>: Enterprise Edition V0.</li>
         * <li><strong>SQL_LOG_V1</strong>: Enterprise Edition V1.</li>
         * <li><strong>SQL_LOG_V2</strong>: Enterprise Edition V2.</li>
         * <li><strong>SQL_LOG_V3</strong>: Enterprise Edition V3.</li>
         * <li><strong>SQL_LOG_NOT_ENABLE</strong>: Enterprise Edition is not enabled.</li>
         * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: Enterprise Edition is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_LOG_V3</p>
         */
        @NameInMap("SupportVersion")
        public String supportVersion;

        /**
         * <p>The current DAS Enterprise Edition version that is enabled. Valid values:</p>
         * <ul>
         * <li><strong>SQL_LOG_V0</strong>: Enterprise Edition V0.</li>
         * <li><strong>SQL_LOG_V1</strong>: Enterprise Edition V1.</li>
         * <li><strong>SQL_LOG_V2</strong>: Enterprise Edition V2.</li>
         * <li><strong>SQL_LOG_V3</strong>: Enterprise Edition V3.</li>
         * <li><strong>SQL_LOG_NOT_ENABLE</strong>: Enterprise Edition is not enabled.</li>
         * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: Enterprise Edition is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_LOG_V3</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeSqlLogConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogConfigResponseBodyData self = new DescribeSqlLogConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogConfigResponseBodyData setColdEnable(Boolean coldEnable) {
            this.coldEnable = coldEnable;
            return this;
        }
        public Boolean getColdEnable() {
            return this.coldEnable;
        }

        public DescribeSqlLogConfigResponseBodyData setColdRetention(Integer coldRetention) {
            this.coldRetention = coldRetention;
            return this;
        }
        public Integer getColdRetention() {
            return this.coldRetention;
        }

        public DescribeSqlLogConfigResponseBodyData setColdStartTime(Long coldStartTime) {
            this.coldStartTime = coldStartTime;
            return this;
        }
        public Long getColdStartTime() {
            return this.coldStartTime;
        }

        public DescribeSqlLogConfigResponseBodyData setCollectorVersion(String collectorVersion) {
            this.collectorVersion = collectorVersion;
            return this;
        }
        public String getCollectorVersion() {
            return this.collectorVersion;
        }

        public DescribeSqlLogConfigResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeSqlLogConfigResponseBodyData setHotEnable(Boolean hotEnable) {
            this.hotEnable = hotEnable;
            return this;
        }
        public Boolean getHotEnable() {
            return this.hotEnable;
        }

        public DescribeSqlLogConfigResponseBodyData setHotRetention(Integer hotRetention) {
            this.hotRetention = hotRetention;
            return this;
        }
        public Integer getHotRetention() {
            return this.hotRetention;
        }

        public DescribeSqlLogConfigResponseBodyData setHotStartTime(Long hotStartTime) {
            this.hotStartTime = hotStartTime;
            return this;
        }
        public Long getHotStartTime() {
            return this.hotStartTime;
        }

        public DescribeSqlLogConfigResponseBodyData setLogFilter(String logFilter) {
            this.logFilter = logFilter;
            return this;
        }
        public String getLogFilter() {
            return this.logFilter;
        }

        public DescribeSqlLogConfigResponseBodyData setRequestEnable(Boolean requestEnable) {
            this.requestEnable = requestEnable;
            return this;
        }
        public Boolean getRequestEnable() {
            return this.requestEnable;
        }

        public DescribeSqlLogConfigResponseBodyData setRequestStartTime(Long requestStartTime) {
            this.requestStartTime = requestStartTime;
            return this;
        }
        public Long getRequestStartTime() {
            return this.requestStartTime;
        }

        public DescribeSqlLogConfigResponseBodyData setRequestStopTime(Long requestStopTime) {
            this.requestStopTime = requestStopTime;
            return this;
        }
        public Long getRequestStopTime() {
            return this.requestStopTime;
        }

        public DescribeSqlLogConfigResponseBodyData setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public DescribeSqlLogConfigResponseBodyData setSqlLogEnable(Boolean sqlLogEnable) {
            this.sqlLogEnable = sqlLogEnable;
            return this;
        }
        public Boolean getSqlLogEnable() {
            return this.sqlLogEnable;
        }

        public DescribeSqlLogConfigResponseBodyData setSqlLogSource(String sqlLogSource) {
            this.sqlLogSource = sqlLogSource;
            return this;
        }
        public String getSqlLogSource() {
            return this.sqlLogSource;
        }

        public DescribeSqlLogConfigResponseBodyData setSqlLogState(String sqlLogState) {
            this.sqlLogState = sqlLogState;
            return this;
        }
        public String getSqlLogState() {
            return this.sqlLogState;
        }

        public DescribeSqlLogConfigResponseBodyData setSqlLogVisibleTime(Long sqlLogVisibleTime) {
            this.sqlLogVisibleTime = sqlLogVisibleTime;
            return this;
        }
        public Long getSqlLogVisibleTime() {
            return this.sqlLogVisibleTime;
        }

        public DescribeSqlLogConfigResponseBodyData setSupportMigration(Boolean supportMigration) {
            this.supportMigration = supportMigration;
            return this;
        }
        public Boolean getSupportMigration() {
            return this.supportMigration;
        }

        public DescribeSqlLogConfigResponseBodyData setSupportSecurityAudit(Boolean supportSecurityAudit) {
            this.supportSecurityAudit = supportSecurityAudit;
            return this;
        }
        public Boolean getSupportSecurityAudit() {
            return this.supportSecurityAudit;
        }

        public DescribeSqlLogConfigResponseBodyData setSupportVersion(String supportVersion) {
            this.supportVersion = supportVersion;
            return this;
        }
        public String getSupportVersion() {
            return this.supportVersion;
        }

        public DescribeSqlLogConfigResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
