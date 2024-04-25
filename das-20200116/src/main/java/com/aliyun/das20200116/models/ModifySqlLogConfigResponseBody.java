// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>SqlLogConfig</p>
     */
    @NameInMap("Data")
    public ModifySqlLogConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ColdEnable")
        public Boolean coldEnable;

        @NameInMap("ColdRetention")
        public Integer coldRetention;

        @NameInMap("ColdStartTime")
        public Long coldStartTime;

        @NameInMap("CollectorVersion")
        public String collectorVersion;

        @NameInMap("HotEnable")
        public Boolean hotEnable;

        @NameInMap("HotRetention")
        public Integer hotRetention;

        @NameInMap("HotStartTime")
        public Long hotStartTime;

        @NameInMap("LogFilter")
        public String logFilter;

        @NameInMap("RequestEnable")
        public Boolean requestEnable;

        @NameInMap("RequestStartTime")
        public Long requestStartTime;

        @NameInMap("RequestStopTime")
        public Long requestStopTime;

        @NameInMap("Retention")
        public Integer retention;

        @NameInMap("SqlLogEnable")
        public Boolean sqlLogEnable;

        @NameInMap("SqlLogState")
        public String sqlLogState;

        @NameInMap("SqlLogVisibleTime")
        public Long sqlLogVisibleTime;

        @NameInMap("SupportVersion")
        public String supportVersion;

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
