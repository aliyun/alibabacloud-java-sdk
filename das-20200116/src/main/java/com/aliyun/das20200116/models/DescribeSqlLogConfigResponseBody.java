// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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
         * <p>Indicates whether the cold data storage is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ColdEnable")
        public Boolean coldEnable;

        /**
         * <p>The number of days for which the SQL Explorer and Audit data is stored in cold storage.</p>
         */
        @NameInMap("ColdRetention")
        public Integer coldRetention;

        /**
         * <p>The time when the cold data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ColdStartTime")
        public Long coldStartTime;

        /**
         * <p>The collector version. Valid values:</p>
         * <br>
         * <p>*   **MYSQL_V0**</p>
         * <p>*   **MYSQL_V1**</p>
         * <p>*   **MYSQL_V2**</p>
         * <p>*   **MYSQL_V3**</p>
         * <p>*   **PG_V1**</p>
         * <p>*   **rdspg_v1**</p>
         * <p>*   **polarpg_v1**</p>
         */
        @NameInMap("CollectorVersion")
        public String collectorVersion;

        /**
         * <p>Indicates whether the hot data storage is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HotEnable")
        public Boolean hotEnable;

        /**
         * <p>The number of days for which the SQL Explorer and Audit data is stored in hot storage.</p>
         */
        @NameInMap("HotRetention")
        public Integer hotRetention;

        /**
         * <p>The time when the hot data storage was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("HotStartTime")
        public Long hotStartTime;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("LogFilter")
        public String logFilter;

        /**
         * <p>Indicates whether the SQL Explorer feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("RequestEnable")
        public Boolean requestEnable;

        /**
         * <p>The time when the SQL Explorer feature was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("RequestStartTime")
        public Long requestStartTime;

        /**
         * <p>The time when DAS Enterprise Edition V1 expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("RequestStopTime")
        public Long requestStopTime;

        /**
         * <p>The total storage duration of the SQL Explorer and Audit data. The value of this parameter is the sum of the values of **HotRetention** and **ColdRetention**. Unit: day.</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SqlLogEnable")
        public Boolean sqlLogEnable;

        /**
         * <p>The state of data migration. Valid values:</p>
         * <br>
         * <p>*   **FINISH**: The historical data is migrated.</p>
         * <p>*   **RUNNING**: The historical data is being migrated.</p>
         * <p>*   **FAILURE**: The historical data fails to be migrated.</p>
         */
        @NameInMap("SqlLogState")
        public String sqlLogState;

        /**
         * <p>The time when DAS Enterprise Edition was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("SqlLogVisibleTime")
        public Long sqlLogVisibleTime;

        /**
         * <p>The latest version of DAS Enterprise Edition that supports the database instance. Valid values:</p>
         * <br>
         * <p>*   **SQL_LOG_V0**: DAS Enterprise Edition V0.</p>
         * <p>*   **SQL_LOG_V1**: DAS Enterprise version V1.</p>
         * <p>*   **SQL_LOG_V2**: DAS Enterprise Edition V2.</p>
         * <p>*   **SQL_LOG_V3**: DAS Enterprise Edition V3.</p>
         * <p>*   **SQL_LOG_NOT_ENABLE**: DAS Enterprise Edition is not enabled.</p>
         * <p>*   **SQL_LOG_NOT_SUPPORT**: DAS Enterprise Edition is not supported.</p>
         */
        @NameInMap("SupportVersion")
        public String supportVersion;

        /**
         * <p>The version of DAS Enterprise Edition that is enabled for the database instance. Valid values:</p>
         * <br>
         * <p>*   **SQL_LOG_V0**: DAS Enterprise Edition V0.</p>
         * <p>*   **SQL_LOG_V1**: DAS Enterprise version V1.</p>
         * <p>*   **SQL_LOG_V2**: DAS Enterprise Edition V2.</p>
         * <p>*   **SQL_LOG_V3**: DAS Enterprise Edition V3.</p>
         * <p>*   **SQL_LOG_NOT_ENABLE**: DAS Enterprise Edition is not enabled.</p>
         * <p>*   **SQL_LOG_NOT_SUPPORT**: DAS Enterprise Edition is not supported.</p>
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
