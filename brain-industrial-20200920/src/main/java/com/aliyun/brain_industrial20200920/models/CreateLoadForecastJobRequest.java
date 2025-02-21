// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateLoadForecastJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>electricityMeter</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>FIFTEEN_MIN</p>
     */
    @NameInMap("Freq")
    public String freq;

    @NameInMap("HistoryData")
    public java.util.List<CreateLoadForecastJobRequestHistoryData> historyData;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <strong>example:</strong>
     * <p>2025-12-12</p>
     */
    @NameInMap("RunDate")
    public String runDate;

    /**
     * <strong>example:</strong>
     * <p>load</p>
     */
    @NameInMap("SystemType")
    public String systemType;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static CreateLoadForecastJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadForecastJobRequest self = new CreateLoadForecastJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadForecastJobRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateLoadForecastJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateLoadForecastJobRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreateLoadForecastJobRequest setHistoryData(java.util.List<CreateLoadForecastJobRequestHistoryData> historyData) {
        this.historyData = historyData;
        return this;
    }
    public java.util.List<CreateLoadForecastJobRequestHistoryData> getHistoryData() {
        return this.historyData;
    }

    public CreateLoadForecastJobRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateLoadForecastJobRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreateLoadForecastJobRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreateLoadForecastJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class CreateLoadForecastJobRequestHistoryData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-12 00:00:00</p>
         */
        @NameInMap("RunTime")
        public String runTime;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Double value;

        public static CreateLoadForecastJobRequestHistoryData build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadForecastJobRequestHistoryData self = new CreateLoadForecastJobRequestHistoryData();
            return TeaModel.build(map, self);
        }

        public CreateLoadForecastJobRequestHistoryData setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public CreateLoadForecastJobRequestHistoryData setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
