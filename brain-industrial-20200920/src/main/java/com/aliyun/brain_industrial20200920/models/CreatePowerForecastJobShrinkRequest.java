// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastJobShrinkRequest extends TeaModel {
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
    public String historyDataShrink;

    @NameInMap("Location")
    public String locationShrink;

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

    public static CreatePowerForecastJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastJobShrinkRequest self = new CreatePowerForecastJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastJobShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreatePowerForecastJobShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePowerForecastJobShrinkRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreatePowerForecastJobShrinkRequest setHistoryDataShrink(String historyDataShrink) {
        this.historyDataShrink = historyDataShrink;
        return this;
    }
    public String getHistoryDataShrink() {
        return this.historyDataShrink;
    }

    public CreatePowerForecastJobShrinkRequest setLocationShrink(String locationShrink) {
        this.locationShrink = locationShrink;
        return this;
    }
    public String getLocationShrink() {
        return this.locationShrink;
    }

    public CreatePowerForecastJobShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreatePowerForecastJobShrinkRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreatePowerForecastJobShrinkRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreatePowerForecastJobShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
