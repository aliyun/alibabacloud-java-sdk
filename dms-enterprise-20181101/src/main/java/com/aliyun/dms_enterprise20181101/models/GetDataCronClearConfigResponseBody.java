// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearConfigResponseBody extends TeaModel {
    @NameInMap("DataCronClearConfig")
    public GetDataCronClearConfigResponseBodyDataCronClearConfig dataCronClearConfig;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataCronClearConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearConfigResponseBody self = new GetDataCronClearConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCronClearConfigResponseBody setDataCronClearConfig(GetDataCronClearConfigResponseBodyDataCronClearConfig dataCronClearConfig) {
        this.dataCronClearConfig = dataCronClearConfig;
        return this;
    }
    public GetDataCronClearConfigResponseBodyDataCronClearConfig getDataCronClearConfig() {
        return this.dataCronClearConfig;
    }

    public GetDataCronClearConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCronClearConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCronClearConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCronClearConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCronClearConfigResponseBodyDataCronClearConfig extends TeaModel {
        @NameInMap("CronCallTimes")
        public String cronCallTimes;

        @NameInMap("CronFormat")
        public String cronFormat;

        @NameInMap("CronLastCallStartTime")
        public String cronLastCallStartTime;

        @NameInMap("CronNextCallTime")
        public String cronNextCallTime;

        @NameInMap("CronStatus")
        public String cronStatus;

        @NameInMap("CurrentClearTaskCount")
        public Long currentClearTaskCount;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("OptimizeTableAfterEveryClearTimes")
        public Long optimizeTableAfterEveryClearTimes;

        public static GetDataCronClearConfigResponseBodyDataCronClearConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataCronClearConfigResponseBodyDataCronClearConfig self = new GetDataCronClearConfigResponseBodyDataCronClearConfig();
            return TeaModel.build(map, self);
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCronCallTimes(String cronCallTimes) {
            this.cronCallTimes = cronCallTimes;
            return this;
        }
        public String getCronCallTimes() {
            return this.cronCallTimes;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCronFormat(String cronFormat) {
            this.cronFormat = cronFormat;
            return this;
        }
        public String getCronFormat() {
            return this.cronFormat;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCronLastCallStartTime(String cronLastCallStartTime) {
            this.cronLastCallStartTime = cronLastCallStartTime;
            return this;
        }
        public String getCronLastCallStartTime() {
            return this.cronLastCallStartTime;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCronNextCallTime(String cronNextCallTime) {
            this.cronNextCallTime = cronNextCallTime;
            return this;
        }
        public String getCronNextCallTime() {
            return this.cronNextCallTime;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCronStatus(String cronStatus) {
            this.cronStatus = cronStatus;
            return this;
        }
        public String getCronStatus() {
            return this.cronStatus;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setCurrentClearTaskCount(Long currentClearTaskCount) {
            this.currentClearTaskCount = currentClearTaskCount;
            return this;
        }
        public Long getCurrentClearTaskCount() {
            return this.currentClearTaskCount;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetDataCronClearConfigResponseBodyDataCronClearConfig setOptimizeTableAfterEveryClearTimes(Long optimizeTableAfterEveryClearTimes) {
            this.optimizeTableAfterEveryClearTimes = optimizeTableAfterEveryClearTimes;
            return this;
        }
        public Long getOptimizeTableAfterEveryClearTimes() {
            return this.optimizeTableAfterEveryClearTimes;
        }

    }

}
