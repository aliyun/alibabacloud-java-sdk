// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertVolume extends TeaModel {
    @NameInMap("IntegratedLoudnessTarget")
    public Integer integratedLoudnessTarget;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("LoudnessRangeTarget")
    public Integer loudnessRangeTarget;

    @NameInMap("Method")
    public String method;

    @NameInMap("TruePeak")
    public Integer truePeak;

    public static MediaConvertVolume build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertVolume self = new MediaConvertVolume();
        return TeaModel.build(map, self);
    }

    public MediaConvertVolume setIntegratedLoudnessTarget(Integer integratedLoudnessTarget) {
        this.integratedLoudnessTarget = integratedLoudnessTarget;
        return this;
    }
    public Integer getIntegratedLoudnessTarget() {
        return this.integratedLoudnessTarget;
    }

    public MediaConvertVolume setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public MediaConvertVolume setLoudnessRangeTarget(Integer loudnessRangeTarget) {
        this.loudnessRangeTarget = loudnessRangeTarget;
        return this;
    }
    public Integer getLoudnessRangeTarget() {
        return this.loudnessRangeTarget;
    }

    public MediaConvertVolume setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MediaConvertVolume setTruePeak(Integer truePeak) {
        this.truePeak = truePeak;
        return this;
    }
    public Integer getTruePeak() {
        return this.truePeak;
    }

}
