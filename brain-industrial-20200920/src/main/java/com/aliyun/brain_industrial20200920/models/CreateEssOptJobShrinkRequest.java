// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreateEssOptJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("ElecPrice")
    public String elecPriceShrink;

    /**
     * <strong>example:</strong>
     * <p>FIFTEEN_MIN</p>
     */
    @NameInMap("Freq")
    public String freq;

    @NameInMap("GenPrice")
    public String genPriceShrink;

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

    @NameInMap("SystemData")
    public String systemDataShrink;

    /**
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <strong>example:</strong>
     * <p>LOAD_ESS_SOLAR</p>
     */
    @NameInMap("TopoType")
    public String topoType;

    public static CreateEssOptJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEssOptJobShrinkRequest self = new CreateEssOptJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEssOptJobShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateEssOptJobShrinkRequest setElecPriceShrink(String elecPriceShrink) {
        this.elecPriceShrink = elecPriceShrink;
        return this;
    }
    public String getElecPriceShrink() {
        return this.elecPriceShrink;
    }

    public CreateEssOptJobShrinkRequest setFreq(String freq) {
        this.freq = freq;
        return this;
    }
    public String getFreq() {
        return this.freq;
    }

    public CreateEssOptJobShrinkRequest setGenPriceShrink(String genPriceShrink) {
        this.genPriceShrink = genPriceShrink;
        return this;
    }
    public String getGenPriceShrink() {
        return this.genPriceShrink;
    }

    public CreateEssOptJobShrinkRequest setLocationShrink(String locationShrink) {
        this.locationShrink = locationShrink;
        return this;
    }
    public String getLocationShrink() {
        return this.locationShrink;
    }

    public CreateEssOptJobShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateEssOptJobShrinkRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public CreateEssOptJobShrinkRequest setSystemDataShrink(String systemDataShrink) {
        this.systemDataShrink = systemDataShrink;
        return this;
    }
    public String getSystemDataShrink() {
        return this.systemDataShrink;
    }

    public CreateEssOptJobShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateEssOptJobShrinkRequest setTopoType(String topoType) {
        this.topoType = topoType;
        return this;
    }
    public String getTopoType() {
        return this.topoType;
    }

}
