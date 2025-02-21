// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateLoadForecastJobShrinkRequest extends TeaModel {
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

    public static CreateLoadForecastJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadForecastJobShrinkRequest self = new CreateLoadForecastJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadForecastJobShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateLoadForecastJobShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateLoadForecastJobShrinkRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreateLoadForecastJobShrinkRequest setHistoryDataShrink(String historyDataShrink) {
        this.historyDataShrink = historyDataShrink;
        return this;
    }
    public String getHistoryDataShrink() {
        return this.historyDataShrink;
    }

    public CreateLoadForecastJobShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateLoadForecastJobShrinkRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreateLoadForecastJobShrinkRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreateLoadForecastJobShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
