// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigResponseBody extends TeaModel {
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
    public ModifySqlLogConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>03C88D8E-1541-518E-8BFF-BEC6589B6334</p>
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
         * <p>Indicates whether cold data storage is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ColdEnable")
        public Boolean coldEnable;

        /**
         * <p>The cold data storage duration. Unit: days. The value is calculated by using the formula: <code>Retention - HotRetention</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ColdRetention")
        public Integer coldRetention;

        /**
         * <p>The start time of cold data storage. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
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
         * <li><strong>rdspg_v1</strong>: ApsaraDB RDS for PostgreSQL V1.</li>
         * <li><strong>polarpg_v1</strong>: PolarDB for PostgreSQL V1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MYSQL_V3</p>
         */
        @NameInMap("CollectorVersion")
        public String collectorVersion;

        /**
         * <p>Indicates whether hot data storage is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
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
         * <p>The start time of hot data storage. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
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
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequestEnable")
        public Boolean requestEnable;

        /**
         * <p>The time when SQL Explorer was enabled. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("RequestStartTime")
        public Long requestStartTime;

        /**
         * <p>The expiration time of DAS Enterprise Edition V1. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715335200000</p>
         */
        @NameInMap("RequestStopTime")
        public Long requestStopTime;

        /**
         * <p>The total data storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SqlLogEnable")
        public Boolean sqlLogEnable;

        /**
         * <p>The source of the enabled audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>DSC:DAS_SIDE</p>
         */
        @NameInMap("SqlLogSource")
        public String sqlLogSource;

        /**
         * <p>The data migration status. Valid values:</p>
         * <ul>
         * <li><strong>FINISH</strong>: Historical data migration is completed.</li>
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
         * <p>The time when DAS Enterprise Edition was enabled. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683712800000</p>
         */
        @NameInMap("SqlLogVisibleTime")
        public Long sqlLogVisibleTime;

        /**
         * <p>The latest supported DAS Enterprise Edition version. Valid values:</p>
         * <ul>
         * <li><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0.</li>
         * <li><strong>SQL_LOG_V1</strong>: DAS Enterprise Edition V1.</li>
         * <li><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2.</li>
         * <li><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3.</li>
         * <li><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</li>
         * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_LOG_V3</p>
         */
        @NameInMap("SupportVersion")
        public String supportVersion;

        /**
         * <p>The enabled DAS Enterprise Edition version. Valid values:</p>
         * <ul>
         * <li><strong>SQL_LOG_V0</strong>: DAS Enterprise Edition V0.</li>
         * <li><strong>SQL_LOG_V1</strong>: DAS Enterprise Edition V1.</li>
         * <li><strong>SQL_LOG_V2</strong>: DAS Enterprise Edition V2.</li>
         * <li><strong>SQL_LOG_V3</strong>: DAS Enterprise Edition V3.</li>
         * <li><strong>SQL_LOG_NOT_ENABLE</strong>: DAS Enterprise Edition is not enabled.</li>
         * <li><strong>SQL_LOG_NOT_SUPPORT</strong>: DAS Enterprise Edition is not supported.</li>
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
