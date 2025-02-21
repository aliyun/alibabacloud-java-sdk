// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastJobRequest extends TeaModel {
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
    public java.util.List<CreatePowerForecastJobRequestHistoryData> historyData;

    @NameInMap("Location")
    public CreatePowerForecastJobRequestLocation location;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <strong>example:</strong>
     * <p>2025-02-12</p>
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

    public static CreatePowerForecastJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastJobRequest self = new CreatePowerForecastJobRequest();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastJobRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreatePowerForecastJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePowerForecastJobRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreatePowerForecastJobRequest setHistoryData(java.util.List<CreatePowerForecastJobRequestHistoryData> historyData) {
        this.historyData = historyData;
        return this;
    }
    public java.util.List<CreatePowerForecastJobRequestHistoryData> getHistoryData() {
        return this.historyData;
    }

    public CreatePowerForecastJobRequest setLocation(CreatePowerForecastJobRequestLocation location) {
        this.location = location;
        return this;
    }
    public CreatePowerForecastJobRequestLocation getLocation() {
        return this.location;
    }

    public CreatePowerForecastJobRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreatePowerForecastJobRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreatePowerForecastJobRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreatePowerForecastJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class CreatePowerForecastJobRequestHistoryData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-02-12 00:00:00</p>
         */
        @NameInMap("RunTime")
        public String runTime;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Value")
        public Double value;

        public static CreatePowerForecastJobRequestHistoryData build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastJobRequestHistoryData self = new CreatePowerForecastJobRequestHistoryData();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastJobRequestHistoryData setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public CreatePowerForecastJobRequestHistoryData setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class CreatePowerForecastJobRequestLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.123</p>
         */
        @NameInMap("Altitude")
        public Double altitude;

        /**
         * <strong>example:</strong>
         * <p>40.027</p>
         */
        @NameInMap("Latitude")
        public Double latitude;

        /**
         * <strong>example:</strong>
         * <p>120.042</p>
         */
        @NameInMap("Longitude")
        public Double longitude;

        public static CreatePowerForecastJobRequestLocation build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastJobRequestLocation self = new CreatePowerForecastJobRequestLocation();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastJobRequestLocation setAltitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }
        public Double getAltitude() {
            return this.altitude;
        }

        public CreatePowerForecastJobRequestLocation setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public CreatePowerForecastJobRequestLocation setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

    }

}
