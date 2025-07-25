// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePowerForecastByFileUrlJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>stationA</p>
     */
    @NameInMap("BusinessKey")
    public String businessKey;

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
    public String locationShrink;

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

    public static CreatePowerForecastByFileUrlJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePowerForecastByFileUrlJobShrinkRequest self = new CreatePowerForecastByFileUrlJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }
    public String getBusinessKey() {
        return this.businessKey;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
        return this;
    }
    public String getHistoryUrl() {
        return this.historyUrl;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setLocationShrink(String locationShrink) {
        this.locationShrink = locationShrink;
        return this;
    }
    public String getLocationShrink() {
        return this.locationShrink;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
        return this;
    }
    public String getTimeColumn() {
        return this.timeColumn;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreatePowerForecastByFileUrlJobShrinkRequest setValueColumn(String valueColumn) {
        this.valueColumn = valueColumn;
        return this;
    }
    public String getValueColumn() {
        return this.valueColumn;
    }

}
