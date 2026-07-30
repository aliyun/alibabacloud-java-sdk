// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
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
    public ModifySqlLogConfigResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message is returned.</p>
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
     * <p>03C88D8E-1541-518E-8BFF-BEC6589B6334</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifySqlLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlLogConfigResponseBody self = new ModifySqlLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySqlLogConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySqlLogConfigResponseBody setData(ModifySqlLogConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySqlLogConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifySqlLogConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySqlLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySqlLogConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifySqlLogConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the cold data storage is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ColdEnable")
        public Boolean coldEnable;

        /**
         * <p>The retention period of the cold data. Unit: day. This value is calculated by using the following formula: <code>Retention - HotRetention</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ColdRetention")
        public Integer coldRetention;

        /**
         * <p>The time when the cold data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("ColdStartTime")
        public Long coldStartTime;

        /**
         * <p>The version of the database collector. Valid values:</p>
         * <ul>
         * <li><p><strong>MYSQL_V0</strong>: MySQL V0</p>
         * </li>
         * <li><p><strong>MYSQL_V1</strong>: MySQL V1</p>
         * </li>
         * <li><p><strong>MYSQL_V2</strong>: MySQL V2</p>
         * </li>
         * <li><p><strong>MYSQL_V3</strong>: MySQL V3</p>
         * </li>
         * <li><p><strong>PG_V1</strong>: PostgreSQL V1</p>
         * </li>
         * <li><p><strong>rdspg_v1</strong>: ApsaraDB RDS for PostgreSQL V1</p>
         * </li>
         * <li><p><strong>polarpg_v1</strong>: PolarDB for PostgreSQL V1</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MYSQL_V3</p>
         */
        @NameInMap("CollectorVersion")
        public String collectorVersion;

        /**
         * <p>Indicates whether the hot data storage is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HotEnable")
        public Boolean hotEnable;

        /**
         * <p>The retention period of the hot data. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotRetention")
        public Integer hotRetention;

        /**
         * <p>The time when the hot data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>Indicates whether SQL Explorer is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequestEnable")
        public Boolean requestEnable;

        /**
         * <p>The time when SQL Explorer was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("RequestStartTime")
        public Long requestStartTime;

        /**
         * <p>The expiration time of DAS Enterprise Edition. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1715335200000</p>
         */
        @NameInMap("RequestStopTime")
        public Long requestStopTime;

        /**
         * <p>The total retention period of data. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SqlLogEnable")
        public Boolean sqlLogEnable;

        /**
         * <p>The source of the audit log.</p>
         */
        @NameInMap("SqlLogSource")
        public String sqlLogSource;

        /**
         * <p>The data migration state. Valid values:</p>
         * <ul>
         * <li><p><strong>FINISH</strong>: The historical data is migrated.</p>
         * </li>
         * <li><p><strong>RUNNING</strong>: The historical data is being migrated.</p>
         * </li>
         * <li><p><strong>FAILURE</strong>: The historical data fails to be migrated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("SqlLogState")
        public String sqlLogState;

        /**
         * <p>The time when DAS Enterprise Edition was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("SqlLogVisibleTime")
        public Long sqlLogVisibleTime;

        /**
         * <p>The latest supported version of DAS Enterprise Edition. Valid values:</p>
         * <ul>
         * <li><p><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0</p>
         * </li>
         * <li><p><strong>SQL_LOG_V1</strong>: DAS Enterprise Edition V1</p>
         * </li>
         * <li><p><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2</p>
         * </li>
         * <li><p><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3</p>
         * </li>
         * <li><p><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</p>
         * </li>
         * <li><p><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_LOG_V3</p>
         */
        @NameInMap("SupportVersion")
        public String supportVersion;

        /**
         * <p>The current version of DAS Enterprise Edition. Valid values:</p>
         * <ul>
         * <li><p><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0</p>
         * </li>
         * <li><p><strong>SQL_LOG_V1</strong>: DAS Enterprise Edition V1</p>
         * </li>
         * <li><p><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2</p>
         * </li>
         * <li><p><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3</p>
         * </li>
         * <li><p><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</p>
         * </li>
         * <li><p><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_LOG_V3</p>
         */
        @NameInMap("Version")
        public String version;

        public static ModifySqlLogConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySqlLogConfigResponseBodyData self = new ModifySqlLogConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySqlLogConfigResponseBodyData setColdEnable(Boolean coldEnable) {
            this.coldEnable = coldEnable;
            return this;
        }
        public Boolean getColdEnable() {
            return this.coldEnable;
        }

        public ModifySqlLogConfigResponseBodyData setColdRetention(Integer coldRetention) {
            this.coldRetention = coldRetention;
            return this;
        }
        public Integer getColdRetention() {
            return this.coldRetention;
        }

        public ModifySqlLogConfigResponseBodyData setColdStartTime(Long coldStartTime) {
            this.coldStartTime = coldStartTime;
            return this;
        }
        public Long getColdStartTime() {
            return this.coldStartTime;
        }

        public ModifySqlLogConfigResponseBodyData setCollectorVersion(String collectorVersion) {
            this.collectorVersion = collectorVersion;
            return this;
        }
        public String getCollectorVersion() {
            return this.collectorVersion;
        }

        public ModifySqlLogConfigResponseBodyData setHotEnable(Boolean hotEnable) {
            this.hotEnable = hotEnable;
            return this;
        }
        public Boolean getHotEnable() {
            return this.hotEnable;
        }

        public ModifySqlLogConfigResponseBodyData setHotRetention(Integer hotRetention) {
            this.hotRetention = hotRetention;
            return this;
        }
        public Integer getHotRetention() {
            return this.hotRetention;
        }

        public ModifySqlLogConfigResponseBodyData setHotStartTime(Long hotStartTime) {
            this.hotStartTime = hotStartTime;
            return this;
        }
        public Long getHotStartTime() {
            return this.hotStartTime;
        }

        public ModifySqlLogConfigResponseBodyData setLogFilter(String logFilter) {
            this.logFilter = logFilter;
            return this;
        }
        public String getLogFilter() {
            return this.logFilter;
        }

        public ModifySqlLogConfigResponseBodyData setRequestEnable(Boolean requestEnable) {
            this.requestEnable = requestEnable;
            return this;
        }
        public Boolean getRequestEnable() {
            return this.requestEnable;
        }

        public ModifySqlLogConfigResponseBodyData setRequestStartTime(Long requestStartTime) {
            this.requestStartTime = requestStartTime;
            return this;
        }
        public Long getRequestStartTime() {
            return this.requestStartTime;
        }

        public ModifySqlLogConfigResponseBodyData setRequestStopTime(Long requestStopTime) {
            this.requestStopTime = requestStopTime;
            return this;
        }
        public Long getRequestStopTime() {
            return this.requestStopTime;
        }

        public ModifySqlLogConfigResponseBodyData setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public ModifySqlLogConfigResponseBodyData setSqlLogEnable(Boolean sqlLogEnable) {
            this.sqlLogEnable = sqlLogEnable;
            return this;
        }
        public Boolean getSqlLogEnable() {
            return this.sqlLogEnable;
        }

        public ModifySqlLogConfigResponseBodyData setSqlLogSource(String sqlLogSource) {
            this.sqlLogSource = sqlLogSource;
            return this;
        }
        public String getSqlLogSource() {
            return this.sqlLogSource;
        }

        public ModifySqlLogConfigResponseBodyData setSqlLogState(String sqlLogState) {
            this.sqlLogState = sqlLogState;
            return this;
        }
        public String getSqlLogState() {
            return this.sqlLogState;
        }

        public ModifySqlLogConfigResponseBodyData setSqlLogVisibleTime(Long sqlLogVisibleTime) {
            this.sqlLogVisibleTime = sqlLogVisibleTime;
            return this;
        }
        public Long getSqlLogVisibleTime() {
            return this.sqlLogVisibleTime;
        }

        public ModifySqlLogConfigResponseBodyData setSupportVersion(String supportVersion) {
            this.supportVersion = supportVersion;
            return this;
        }
        public String getSupportVersion() {
            return this.supportVersion;
        }

        public ModifySqlLogConfigResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
