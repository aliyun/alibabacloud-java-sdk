// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastByFileUrlJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>stationA</p>
     */
    @NameInMap("BusinessKey")
    public String businessKey;

    /**
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("DataMode")
    public String dataMode;

    /**
     * <strong>example:</strong>
     * <p>solarInverter</p>
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
     * <p>DAY_AHEAD</p>
     */
    @NameInMap("ForecastHorizon")
    public String forecastHorizon;

    /**
     * <strong>example:</strong>
     * <p>FIFTEEN_MIN</p>
     */
    @NameInMap("Freq")
    public String freq;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/dir/target_file.csv">https://bucket.oss-cn-hangzhou.aliyuncs.com/dir/target_file.csv</a></p>
     */
    @NameInMap("HistoryUrl")
    public String historyUrl;

    @NameInMap("Location")
    public CreatePowerForecastByFileUrlJobRequestLocation location;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("RunDate")
    public String runDate;

    /**
     * <strong>example:</strong>
     * <p>solar</p>
     */
    @NameInMap("SystemType")
    public String systemType;

    /**
     * <strong>example:</strong>
     * <p>runTime</p>
     */
    @NameInMap("TimeColumn")
    public String timeColumn;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("ValueColumn")
    public String valueColumn;

    public static CreatePowerForecastByFileUrlJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastByFileUrlJobRequest self = new CreatePowerForecastByFileUrlJobRequest();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastByFileUrlJobRequest setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }
    public String getBusinessKey() {
        return this.businessKey;
    }

    public CreatePowerForecastByFileUrlJobRequest setDataMode(String dataMode) {
        this.dataMode = dataMode;
        return this;
    }
    public String getDataMode() {
        return this.dataMode;
    }

    public CreatePowerForecastByFileUrlJobRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreatePowerForecastByFileUrlJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePowerForecastByFileUrlJobRequest setForecastHorizon(String forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
        return this;
    }
    public String getForecastHorizon() {
        return this.forecastHorizon;
    }

    public CreatePowerForecastByFileUrlJobRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreatePowerForecastByFileUrlJobRequest setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
        return this;
    }
    public String getHistoryUrl() {
        return this.historyUrl;
    }

    public CreatePowerForecastByFileUrlJobRequest setLocation(CreatePowerForecastByFileUrlJobRequestLocation location) {
        this.location = location;
        return this;
    }
    public CreatePowerForecastByFileUrlJobRequestLocation getLocation() {
        return this.location;
    }

    public CreatePowerForecastByFileUrlJobRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreatePowerForecastByFileUrlJobRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreatePowerForecastByFileUrlJobRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreatePowerForecastByFileUrlJobRequest setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
        return this;
    }
    public String getTimeColumn() {
        return this.timeColumn;
    }

    public CreatePowerForecastByFileUrlJobRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreatePowerForecastByFileUrlJobRequest setValueColumn(String valueColumn) {
        this.valueColumn = valueColumn;
        return this;
    }
    public String getValueColumn() {
        return this.valueColumn;
    }

    public static class CreatePowerForecastByFileUrlJobRequestLocation extends TeaModel {
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

        public static CreatePowerForecastByFileUrlJobRequestLocation build(java.util.Map<String, ?> map) throws Exception {
            CreatePowerForecastByFileUrlJobRequestLocation self = new CreatePowerForecastByFileUrlJobRequestLocation();
            return TeaModel.build(map, self);
        }

        public CreatePowerForecastByFileUrlJobRequestLocation setAltitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }
        public Double getAltitude() {
            return this.altitude;
        }

        public CreatePowerForecastByFileUrlJobRequestLocation setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public CreatePowerForecastByFileUrlJobRequestLocation setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

    }

}
