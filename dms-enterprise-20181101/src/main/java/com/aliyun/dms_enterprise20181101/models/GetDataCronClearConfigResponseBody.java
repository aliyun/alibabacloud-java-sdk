// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearConfigResponseBody extends TeaModel {
    /**
     * <p>Data configuration.</p>
     */
    @NameInMap("DataCronClearConfig")
    public GetDataCronClearConfigResponseBodyDataCronClearConfig dataCronClearConfig;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
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
        /**
         * <p>The number of times that the task is run.</p>
         */
        @NameInMap("CronCallTimes")
        public String cronCallTimes;

        /**
         * <p>The crontab expression that you can use to run the task at a specified time. For more information, see [Crontab expression](~~206581~~).</p>
         */
        @NameInMap("CronFormat")
        public String cronFormat;

        /**
         * <p>The time when the task was last run.</p>
         */
        @NameInMap("CronLastCallStartTime")
        public String cronLastCallStartTime;

        /**
         * <p>The time when the task is run next time. This parameter is displayed only when the status of the scheduled task is SUCCESS.</p>
         */
        @NameInMap("CronNextCallTime")
        public String cronNextCallTime;

        /**
         * <p>The status of the scheduled task. If this parameter is empty, it indicates the task is not run. Valid values:</p>
         * <br>
         * <p>*   PAUSE: The task is suspended.</p>
         * <p>*   WAITING: The task is waiting to be run.</p>
         * <p>*   SUCCESS: The task is complete.</p>
         */
        @NameInMap("CronStatus")
        public String cronStatus;

        /**
         * <p>The number of times that the Optimize Table statement is automatically exeuted. This parameter is valid only when the value of the OptimizeTableAfterEveryClearTimes parameter is greater than 0.</p>
         */
        @NameInMap("CurrentClearTaskCount")
        public Long currentClearTaskCount;

        /**
         * <p>The execution duration of the task. Unit: hours. If the value is 0, it indicates the duration is not specified.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Specifies whether to enable automatic execution of the OPTIMIZE TABLE statement. Valid values:</p>
         * <br>
         * <p>*   0: disables automatic execution</p>
         * <p>*   A number greater than 0: enables automatic execution. The number specifies the number of times that cleanup operations must be performed before the OPTIMIZE TABLE statement is automatically executed.</p>
         */
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
